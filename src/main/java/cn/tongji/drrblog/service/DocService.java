package cn.tongji.drrblog.service;


import cn.tongji.drrblog.pojo.entity.DocEntity;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.service.IService;

public interface DocService extends IService<DocEntity> {

    /**
     * 添加一篇文章
     * @param json  doc的JSON格式数据
     * @return 新文章的ID
     */
    Long newDoc(JSONObject json);

    /**
     * 更新一篇文章
     * @param json doc的JSON格式数据
     * @return 文章的ID
     */
    Long updateDoc(JSONObject json);

    /**
     * 根据ID获取文章
     * @param id 文章ID
     * @return  doc的JSON格式数据
     */
    JSONObject getDocById(Long id);

}
