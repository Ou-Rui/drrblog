package cn.tongji.drrblog.controller;


import cn.tongji.drrblog.common.ResponseData;
import cn.tongji.drrblog.pojo.entity.DocEntity;
import cn.tongji.drrblog.pojo.entity.FilterEntity;
import cn.tongji.drrblog.pojo.vo.DocVo;
import cn.tongji.drrblog.service.DocService;
import cn.tongji.drrblog.service.DocTagService;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 文档控制器：
 *      新增文档
 */
@Slf4j
@RestController
@RequestMapping("/doc")
@CrossOrigin
public class DocController {
    @Autowired
    DocService docService;

    @Autowired
    DocTagService docTagService;

    /**
     * 新建文章
     */
    @PostMapping("/new")
    public ResponseData newDoc(@RequestBody JSONObject json) {
        Long id = docService.newDoc(json);
        if (id == null)     ResponseData.error("新建文章失败...");
        else    docTagService.newDocTag(id,json);
        return ResponseData.ok();
    }

    /**
     * 根据 ID 获取文章内容
     */
    @GetMapping("/get")
    public ResponseData getDocById(Long id) {
        if (id == null) {
            return ResponseData.error("缺少文章ID");
        }
        DocVo doc = docService.getDocById(id);
        return ResponseData.ok(doc);
    }

    /**
     * 根据 filter 获取文章内容
     */
    @GetMapping("/filter")
    public ResponseData getDocsByFilter(FilterEntity filter) {
        List<DocVo> docs = docService.getDocsByFilter(filter);
        return ResponseData.ok(docs);
    }
}
