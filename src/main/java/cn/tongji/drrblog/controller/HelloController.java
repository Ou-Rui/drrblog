package cn.tongji.drrblog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {
    @GetMapping("hello")
    public HashMap<Integer,Integer> hello() {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,30);
        map.put(2,80);
        return map;
    }
}
