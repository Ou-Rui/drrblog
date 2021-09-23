package cn.tongji.drrblog.service.impl;

import cn.tongji.drrblog.dao.DocTagDao;
import cn.tongji.drrblog.pojo.entity.DocTagEntity;
import cn.tongji.drrblog.service.DocTagService;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service("docTagService")
public class DocTagServiceImpl extends ServiceImpl<DocTagDao, DocTagEntity> implements DocTagService {


    /**
     * 当新建文章时，创建文章与标签的 1:N 对应关系
     * @param docId 文章ID
     * @param newDocJson    文章表单
     */
    @Override
    public void newDocTag(Long docId, JSONObject newDocJson) {
        JSONArray tags = newDocJson.getJSONArray("tags");
        for (int i = 0; i < tags.size(); i++) {
            DocTagEntity docTagEntity = new DocTagEntity();

            int tagId = tags.getJSONObject(i).getInteger("id");

            docTagEntity.setDocId(docId);
            docTagEntity.setTagId(tagId);

            this.insert(docTagEntity);
        }
    }
}
