package com.jenkins.ic.jenkinsic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TODO
 * @Description (这里用一句话描述这个方法的作用)
 * @Classname HelloController
 * @create 2020-03-06 11:08
 * @UpdateUser TODO
 * @UpdateDate 2020-03-06 11:08
 **/

@RestController
public class HelloController {

    @RequestMapping("/diilxl")
    public String hello(){
        return  "hello world quick1 ？？？！";
    }
}
