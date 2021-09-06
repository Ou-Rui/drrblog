package cn.tongji.drrblog.dao;

import cn.tongji.drrblog.pojo.entity.CategoryEntity;
import cn.tongji.drrblog.pojo.vo.CategoryVo;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {

    List<CategoryVo> getAllCategories();

    Long getCategoryIdByName(String name);
}
