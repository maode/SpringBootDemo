package com.code0.bootDemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    @ResponseBody
    public String index(){
        return "Hello World";
    }

    @RequestMapping("/testTemplate")
    public String testThymeleaf(ModelMap map){
        map.addAttribute("template","temp is Thymeleaf");
        return "testThymeleaf";
    }
}
