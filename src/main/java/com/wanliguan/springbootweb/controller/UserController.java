package com.wanliguan.springbootweb.controller;

import com.wanliguan.springbootweb.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author:wanliguan
 * @date:2019/11/9
 * @description:
 */
@Controller
public class UserController {


    @RequestMapping("/index")
    public String index(Map<String, Object> map)
    {
        map.put("name","guanwanli");
        return "index";
    }

    @RequestMapping("/study")
    public String study(Map<String,Object> map, HttpServletRequest request){
        List<User> userList = new ArrayList<>();
        userList.add(new User("小李",1));
        userList.add(new User("小三",2));
        userList.add(new User("小四",1));

        map.put("userList",userList);

        request.getSession().setAttribute("user",new User("小刘",2));

        return "index";
    }
}
