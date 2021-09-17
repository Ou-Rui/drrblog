package cn.tongji.drrblog.service.impl;

import cn.tongji.drrblog.dao.DocDao;
import cn.tongji.drrblog.pojo.entity.DocEntity;
import cn.tongji.drrblog.pojo.entity.FilterEntity;
import cn.tongji.drrblog.pojo.vo.DocVo;
import cn.tongji.drrblog.service.DocService;
import cn.tongji.drrblog.service.TagService;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;


@Service("docService")
public class DocServiceImpl extends ServiceImpl<DocDao, DocEntity> implements DocService {

    @Autowired
    private TagService tagService;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Long newDoc(JSONObject json) {
        // 从json中读取文章信息，封装为DocEntity
        DocEntity doc = new DocEntity();

        doc.setTitle(json.getString("title"));
        doc.setSummary(json.getString("summary"));

        // 设置分类ID，目前前端的数据包中为类后续要改
        doc.setCategoryId(json.getInteger("categoryId"));
        // 设置tags信息，Array --> String
        JSONArray tagsArray = json.getJSONArray("tags");
        StringBuilder tagsStr= new StringBuilder();
        for (int i = 0; i < tagsArray.size(); i++) {
            if (i != 0)     tagsStr.append(tagService.TAG_SPLITTER);
            tagsStr.append(tagsArray.getString(i));
        }
        doc.setTags(tagsStr.toString());

        // 设置正文信息
        JSONObject body = json.getJSONObject("body");
        doc.setContent(body.getString("content"));
        doc.setContentHtml(body.getString("contentHtml"));

        doc.setCreateTime(new Date());
        doc.setUpdateTime(new Date());

        this.insert(doc);

        return doc.getId();
    }

    @Override
    public Long updateDoc(JSONObject json) {
        return null;
    }

    @Override
    public DocVo getDocById(Long id) {
        DocVo doc = this.baseMapper.getDocById(id);
        return doc;
    }

    @Override
    public List<DocVo> getDocsByFilter(FilterEntity filter) {
        List<DocVo> docs = this.baseMapper.getDocsProfileByFilter(filter);
        return docs;
    }
}
