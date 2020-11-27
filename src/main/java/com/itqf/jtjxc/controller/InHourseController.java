package com.itqf.jtjxc.controller;

import com.itqf.jtjxc.bean.InHourse;
import com.itqf.jtjxc.bean.Result;
import com.itqf.jtjxc.service.InHourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * projectName: jtjxc
 *
 * @author: 葛帮帅
 * time: 2020/11/26 14:04
 * description:
 */
@RequestMapping("inhourse")
@RestController
public class InHourseController {
    @Autowired
    private InHourseService inHourseService;
    @PostMapping("save")
    public Result save(@RequestBody InHourse inHourse){
        Result result = inHourseService.save(inHourse);

        return result;
    }
    @GetMapping("show")
    public Result show(){
        Result res = inHourseService.show();
        return  res;

    }
    @PostMapping ("showbyid")
    public Result showbyid(@RequestBody InHourse inHourse){
        Result res = inHourseService.showbyid(inHourse);
        return  res;

    }
    @PostMapping ("changed")
    public Result changed(@RequestBody InHourse inHourse){
        Result res = inHourseService.changed(inHourse);
        return  res;

    }
    @PostMapping ("delhis")
    public Result daldata(@RequestBody InHourse inHourse){
        Result res = inHourseService.deldata(inHourse);
        return  res;

    }



}
