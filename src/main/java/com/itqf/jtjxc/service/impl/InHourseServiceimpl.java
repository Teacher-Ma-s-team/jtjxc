package com.itqf.jtjxc.service.impl;

import com.itqf.jtjxc.bean.InHourse;
import com.itqf.jtjxc.bean.Result;
import com.itqf.jtjxc.mapper.InHourseMapper;
import com.itqf.jtjxc.service.InHourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * projectName: jtjxc
 *
 * @author: 葛帮帅
 * time: 2020/11/26 13:59
 * description:
 */
@Service
public class InHourseServiceimpl implements InHourseService {
    int sum=0;
    @Autowired
    private InHourseMapper inHourseMapper;
    @Override
    public Result save(InHourse inHourse) {
       Date date =new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss");
        String date1 = sdf.format(date);
        inHourse.setIntime(date1);
        int i = inHourseMapper.inserthourse(inHourse);
        int i1 = inHourseMapper.updatehourse(inHourse);
        if(i>0&&i1>0){
            //System.out.println(inHourse.getInhNumber());
            List<InHourse> all = inHourseMapper.queryAll();
            return Result.OK(all);
        }

        return Result.FAIL();
    }

    @Override
    public Result show() {
        List<InHourse> all = inHourseMapper.queryAll();
        return Result.OK(all);
    }

    @Override
    public Result showbyid(InHourse inHourse) {
        List<InHourse> all = inHourseMapper.querybyid(inHourse);
        return Result.OK(all);
    }

    @Override
    public Result changed(InHourse inHourse) {
        Date date =new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss");
        String date1 = sdf.format(date);
        inHourse.setIntime(date1);
        int i = inHourseMapper.changed(inHourse);
        //int i1 = inHourseMapper.updatehourse(inHourse);
        if(i>0){
            //System.out.println(inHourse.getInhNumber());
            List<InHourse> all = inHourseMapper.queryAll();
            return Result.OK(all);
        }

        return Result.FAIL();
    }

    @Override
    public Result deldata(InHourse inHourse) {
        int i = inHourseMapper.delhis(inHourse);
        if(i>0){
            List<InHourse> all = inHourseMapper.queryAll();
            return Result.OK(all);

        }
        return Result.FAIL();
    }
}
