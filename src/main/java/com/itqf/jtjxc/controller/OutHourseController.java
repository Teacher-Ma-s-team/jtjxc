package com.itqf.jtjxc.controller;

import com.itqf.jtjxc.bean.OutHourse;
import com.itqf.jtjxc.bean.Result;
import com.itqf.jtjxc.service.OutHourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * projectName: jtjxc
 *
 * @author: 葛帮帅
 * time: 2020/11/26 14:04
 * description:
 */
@RequestMapping("outhourse")
@RestController
public class OutHourseController {
    @Autowired
    private OutHourseService outHourseService;
    @PostMapping("save")
    public Result save(@RequestBody OutHourse outHourse){
        Result result = outHourseService.save(outHourse);

        return result;
    }
    @GetMapping("show")
    public Result show(){
        Result res = outHourseService.show();
        return  res;

    }
    @PostMapping ("showbyid")
    public Result showbyid(@RequestBody OutHourse outHourse){
        Result res = outHourseService.showbyid(outHourse);
        return  res;

    }
    @PostMapping ("changed")
    public Result changed(@RequestBody OutHourse outHourse){
        Result res = outHourseService.changed(outHourse);
        return  res;

    }
    @PostMapping ("delhis")
    public Result daldata(@RequestBody OutHourse outHourse){
        Result res = outHourseService.deldata(outHourse);
        return  res;

    }



}
