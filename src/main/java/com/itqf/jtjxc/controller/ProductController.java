package com.itqf.jtjxc.controller;

import com.itqf.jtjxc.bean.Result;
import com.itqf.jtjxc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * projectName: jtjxc
 *
 * @author: 赵伟风
 * time: 2020/11/26 9:22
 * description:
 */
@RequestMapping("product")
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("show")
    public Result show(){
         Result result =  productService.show();
         return  result;
    }
}
