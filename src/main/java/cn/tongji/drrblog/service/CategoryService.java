package cn.tongji.drrblog.service;

import cn.tongji.drrblog.dao.CategoryDao;
import cn.tongji.drrblog.pojo.entity.CategoryEntity;
import cn.tongji.drrblog.pojo.vo.CategoryVo;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

public interface CategoryService extends IService<CategoryEntity> {

    Long newCategory(JSONObject json);

    /**
     * 获取所有的分类信息
     * @return 分类信息的List
     */
    List<CategoryVo> getAllCategories();

    /**
     * 根据name查询id，可以用于判断某个category是否存在
     * @param name 分类的名称
     * @return id
     */
    Long getCategoryIdByName(String name);

}
