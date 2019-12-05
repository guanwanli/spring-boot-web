package com.wanliguan.springbootweb.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author:wanliguan
 * @date:2019/11/8
 * @description:
 */
@Controller
public class InitController {

    @ResponseBody
    @RequestMapping("/info")
    public String init(){
        return "Hello init...";
    }
}
