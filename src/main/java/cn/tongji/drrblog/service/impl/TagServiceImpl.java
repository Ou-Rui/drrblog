package cn.tongji.drrblog.service.impl;

import cn.tongji.drrblog.dao.TagDao;
import cn.tongji.drrblog.pojo.entity.TagEntity;
import cn.tongji.drrblog.pojo.vo.TagVo;
import cn.tongji.drrblog.service.TagService;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("tagService")
public class TagServiceImpl extends ServiceImpl<TagDao, TagEntity> implements TagService {

    @Override
    public Long newTag(JSONObject json) {
        return null;
    }

    @Override
    public Long updateTag(JSONObject json) {
        return null;
    }

    @Override
    public TagEntity getTagById(Long id) {
        return null;
    }

    @Override
    public List<TagVo> getAllTags() {
        return this.baseMapper.getAllTags();
    }

    @Override
    public Long getTagIdByName(String name) {
        return null;
    }
}
