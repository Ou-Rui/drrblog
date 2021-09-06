package cn.tongji.drrblog.controller;


import cn.tongji.drrblog.common.ResponseData;
import cn.tongji.drrblog.pojo.vo.TagVo;
import cn.tongji.drrblog.service.TagService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/tag")
@CrossOrigin
public class TagController {

    @Autowired
    private TagService tagService;

    @GetMapping("/all")
    public ResponseData allTags() {
        List<TagVo> tags = tagService.getAllTags();
        return ResponseData.ok(tags);
    }

}
