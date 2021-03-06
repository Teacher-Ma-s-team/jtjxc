package com.itqf.jtjxc.controller;

import com.itqf.jtjxc.bean.Info;
import com.itqf.jtjxc.bean.Result;
import com.itqf.jtjxc.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LFZ
 * @date 2020-11-26 - 18:36
 */
@RestController
@RequestMapping("info")
public class InfoController {

    @Autowired
    private InfoService infoService;

    @GetMapping("all")
    public Result queryAll(){
        return infoService.queryAll();
    }

    @PostMapping("insert")
    public Result insertOne(Info info){
        return infoService.insert(info);
    }

    @GetMapping("del")
    public Result deleteById(Integer iId){
        return infoService.delete(iId);
    }
}
