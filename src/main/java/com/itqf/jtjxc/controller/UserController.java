package com.itqf.jtjxc.controller;

import com.itqf.jtjxc.bean.Result;
import com.itqf.jtjxc.bean.User;
import com.itqf.jtjxc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * projectName: jtjxc
 *
 * @author: 赵伟风
 * time: 2020/11/24 9:41
 * description:用户模块的controller
 *
 * 项目的url设置
 *
 *   http://ip:8080/jxc/product/delete
 *   http://ip:8080/jxc/user/login
 *
 *   协议：//ip:port/项目的标识/模块的标识
 *   （controller + requestmapping）/功能标识(方法上的注解)
 *
 *   我们需要定义一个登录接口！
 *   接受前端传递的账号和密码
 *   返回result即可！
 */

@RequestMapping("user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;
    // uAccount=root&uPassword=root -- springmvc --- 自动赋值给形参列表
    // 如果形参列表是一个对象，springmvc会自动将参数赋值给对应命名的属性
    // 要求：参数名 和 对象的属性必须一致

    @PostMapping("login")
    public Result login(User user){
        //1.获取请求参数 形参列表已经搞定

        //2.调用业务逻辑
        Result result = userService.login(user);
        //3.响应返回数据
        return result;
    }

}
