package cn.tongji.drrblog.service.impl;

import cn.tongji.drrblog.dao.CategoryDao;
import cn.tongji.drrblog.pojo.entity.CategoryEntity;
import cn.tongji.drrblog.pojo.vo.CategoryVo;
import cn.tongji.drrblog.service.CategoryService;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    /**
     * 获取所有的分类信息
     * @return 分类信息的List
     */
    @Override
    public List<CategoryVo> getAllCategories() {
        return this.baseMapper.getAllCategories();
    }
}
