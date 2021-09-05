package cn.tongji.drrblog.controller;


import cn.tongji.drrblog.common.ResponseData;
import cn.tongji.drrblog.service.DocService;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/new")
    public ResponseData newDoc(@RequestBody JSONObject json) {
        docService.newDoc(json);
        return ResponseData.ok();
    }
}
