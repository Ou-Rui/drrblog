package cn.tongji.drrblog.service;

import cn.tongji.drrblog.pojo.entity.DocTagEntity;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.service.IService;

public interface DocTagService extends IService<DocTagEntity> {

    /**
     * 当新建文章时，创建文章与标签的 1:N 对应关系
     * @param docId 文章ID
     * @param newDocJson    文章表单
     */
    void newDocTag(Long docId, JSONObject newDocJson);

}
