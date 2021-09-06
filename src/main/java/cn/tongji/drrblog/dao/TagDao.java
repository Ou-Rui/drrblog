package cn.tongji.drrblog.dao;

import cn.tongji.drrblog.pojo.entity.TagEntity;
import cn.tongji.drrblog.pojo.vo.TagVo;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface TagDao extends BaseMapper<TagEntity> {

    List<TagVo> getAllTags();

}
