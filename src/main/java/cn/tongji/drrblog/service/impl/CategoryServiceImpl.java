package cn.tongji.drrblog.service.impl;

import cn.tongji.drrblog.dao.CategoryDao;
import cn.tongji.drrblog.pojo.entity.CategoryEntity;
import cn.tongji.drrblog.pojo.vo.CategoryVo;
import cn.tongji.drrblog.service.CategoryService;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    /**
     * 新建一个分类
     * @param json 分类的信息包
     * @return 新分类的id，若创建失败，return null
     */
    @Override
    public Long newCategory(JSONObject json) {
        CategoryEntity category = new CategoryEntity();

        category.setName(json.getString("name"));
        Long id = getCategoryIdByName(category.getName());
        // 如果id非空，说明该category已存在
        if (id != null)     return null;

        category.setDescription(json.getString("description"));
        category.setAvatar("");
        category.setCreateTime(new Date());

        this.insert(category);
        return category.getId();
    }

    /**
     * 获取所有的分类信息
     * @return 分类信息的List
     */
    @Override
    public List<CategoryVo> getAllCategories() {
        return this.baseMapper.getAllCategories();
    }

    @Override
    public Long getCategoryIdByName(String name) {
        return this.baseMapper.getCategoryIdByName(name);
    }
}
