package cn.tongji.drrblog.service.impl;

import cn.tongji.drrblog.dao.TagDao;
import cn.tongji.drrblog.pojo.entity.TagEntity;
import cn.tongji.drrblog.pojo.vo.TagVo;
import cn.tongji.drrblog.service.TagService;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service("tagService")
public class TagServiceImpl extends ServiceImpl<TagDao, TagEntity> implements TagService {

    /**
     * 新建一个标签
     * @param json 标签的信息包
     * @return 新标签的id，若创建失败，return null
     */
    @Override
    public Long newTag(JSONObject json) {
        TagEntity tag = new TagEntity();

        tag.setName(json.getString("name"));
        Long id = getTagIdByName(tag.getName());
        // 如果id非空，说明该tag已存在
        if (id != null)     return null;

        tag.setDescription(json.getString("description"));
        tag.setAvatar("");
        tag.setCreateTime(new Date());

        this.insert(tag);
        return tag.getId();
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
        return this.baseMapper.getTagIdByName(name);
    }
}
