package cn.tongji.drrblog.service;

import cn.tongji.drrblog.pojo.entity.TagEntity;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.service.IService;

public interface TagService extends IService<TagEntity> {
    public static final String TAG_SPLITTER = ",";

    Long newTag(JSONObject json);

    Long updateTag(JSONObject json);

    TagEntity getTagById(Long id);

    Long getTagIdByName(String name);



}
