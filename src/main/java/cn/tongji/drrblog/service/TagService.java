package cn.tongji.drrblog.service;

import cn.tongji.drrblog.pojo.entity.TagEntity;
import cn.tongji.drrblog.pojo.vo.TagVo;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

public interface TagService extends IService<TagEntity> {
    public static final String TAG_SPLITTER = ",";

    Integer newTag(JSONObject json);

    Integer updateTag(JSONObject json);

    TagEntity getTagById(Integer id);

    List<TagVo> getAllTags();

    Integer getTagIdByName(String name);



}
