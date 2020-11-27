package com.itqf.jtjxc.controller;

import com.itqf.jtjxc.bean.Product;
import com.itqf.jtjxc.bean.Result;
import com.itqf.jtjxc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("insert")
    public Result insert(Product product){
        System.out.println(product);
        return productService.insert(product);
    }

    @GetMapping("del")
    public Result delete(Integer pid){

        return productService.delete(pid);
    }

    @GetMapping("queryOne")
    public Result queryOneByPid(Integer pid){
        return productService.queryOneByPid(pid);
    }

    @PostMapping("saveEdit")
    public Result saveEdit(Product product){
        System.out.println(product);
        return productService.update(product);
    }

    @GetMapping("queryByTId")
    public Result queryByTId(Integer tId){
        return productService.queryByTId(tId);
    }
}


