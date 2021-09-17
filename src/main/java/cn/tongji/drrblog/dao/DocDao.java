package cn.tongji.drrblog.dao;

import cn.tongji.drrblog.pojo.entity.DocEntity;
import cn.tongji.drrblog.pojo.entity.FilterEntity;
import cn.tongji.drrblog.pojo.vo.DocVo;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface DocDao extends BaseMapper<DocEntity> {

    /**
     * 根据ID获取文章的全部内容
     * @param id 文章ID
     * @return 文章的全部内容
     */
    DocVo getDocById(Long id);

    List<DocVo> getAllDocs();

    /**
     * 根据过滤器获取文章概览，不要文章内容
     * @param filter 过滤器
     * @return 符合条件的文章列表
     */
    List<DocVo> getDocsProfileByFilter(FilterEntity filter);

}
