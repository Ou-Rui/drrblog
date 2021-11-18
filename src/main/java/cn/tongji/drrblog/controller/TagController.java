package cn.tongji.drrblog.controller;

import cn.tongji.drrblog.common.ResponseData;
import cn.tongji.drrblog.pojo.vo.TagVo;
import cn.tongji.drrblog.service.TagService;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/tag")
@CrossOrigin
public class TagController {

    @Autowired
    private TagService tagService;

    /**
     * 新建标签
     */
    @PostMapping("/new")
    public ResponseData newTag(@RequestBody JSONObject json) {
        Integer tagId = tagService.newTag(json);
        if (tagId == null)
            return ResponseData.error("该标签已存在！");
        return ResponseData.ok();
    }

    /**
     * 获取全部的标签信息
     */
    @GetMapping("/all")
    public ResponseData allTags() {
        List<TagVo> tags = tagService.getAllTags();
        return ResponseData.ok(tags);
    }

}
