package cn.tongji.drrblog.controller;

import cn.tongji.drrblog.common.ResponseData;
import cn.tongji.drrblog.pojo.vo.CategoryVo;
import cn.tongji.drrblog.service.CategoryService;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/category")
@CrossOrigin
public class CategoryController {

    @Autowired
    private CategoryService categoryService;


    @PostMapping("/new")
    public ResponseData newCategory(@RequestBody JSONObject json) {
        Integer categoryId = categoryService.newCategory(json);
        if (categoryId == null)     return ResponseData.error("该分类已存在");
        return ResponseData.ok();
    }

    @GetMapping("/all")
    public ResponseData allCategories() {
        List<CategoryVo> categories = categoryService.getAllCategories();
        return ResponseData.ok(categories);
    }
}
