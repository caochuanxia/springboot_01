package com.itgaoshu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 曹小花
 * @Title: UserController
 * @Description: SpringCloudAlibaba课程
 * @date 2020/12/17 0017 14:25
 */
//@RestController和@Controller注解的区别?
    //@RestController≈@Controller+@Responsebody(返回json数据)
@RestController
public class UserController {

    @RequestMapping("test1.do")
    public String test1(){

        return "login.html";
    }
}
