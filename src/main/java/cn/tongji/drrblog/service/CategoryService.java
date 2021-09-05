package cn.tongji.drrblog.service;

import cn.tongji.drrblog.dao.CategoryDao;
import cn.tongji.drrblog.pojo.entity.CategoryEntity;
import cn.tongji.drrblog.pojo.vo.CategoryVo;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

public interface CategoryService extends IService<CategoryEntity> {

    /**
     * 获取所有的分类信息
     * @return 分类信息的List
     */
    List<CategoryVo> getAllCategories();

}
