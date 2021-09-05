package cn.tongji.drrblog.controller;
import cn.tongji.drrblog.common.ResponseData;
import cn.tongji.drrblog.pojo.vo.CategoryVo;
import cn.tongji.drrblog.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/category")
@CrossOrigin
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/all")
    public ResponseData allCategories() {
        List<CategoryVo> categories = categoryService.getAllCategories();
        return ResponseData.ok(categories);
    }
}
