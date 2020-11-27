package com.itqf.jtjxc.service.impl;

import com.itqf.jtjxc.bean.OutHourse;
import com.itqf.jtjxc.bean.Result;
import com.itqf.jtjxc.mapper.OutHourseMapper;
import com.itqf.jtjxc.service.OutHourseService;
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
public class OutHourseServiceimpl implements OutHourseService {
    @Autowired
    private OutHourseMapper outHourseMapper;


    @Override
    public Result show() {
        List<OutHourse> all = outHourseMapper.queryAll();
        return Result.OK(all);
    }
    @Override
    public Result save(OutHourse outHourse) {
       Date date =new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss");
        String date1 = sdf.format(date);
        outHourse.setOuttime(date1);
        int i =  outHourseMapper.inserthourse(outHourse);
        int i1 =  outHourseMapper.updatehourse(outHourse);
        if(i>0&&i1>0){
            //System.out.println(inHourse.getInhNumber());
            List<OutHourse> all = outHourseMapper.queryAll();
            return Result.OK(all);
        }

        return Result.FAIL();
    }



    @Override
    public Result showbyid(OutHourse outHourse) {
        List<OutHourse> all = outHourseMapper.querybyid(outHourse);
        return Result.OK(all);
    }

    @Override
    public Result changed(OutHourse outHourse) {
        Date date =new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss");
        String date1 = sdf.format(date);
        outHourse.setOuttime(date1);
        int i = outHourseMapper.changed(outHourse);
        //int i1 = inHourseMapper.updatehourse(inHourse);
        if(i>0){
            //System.out.println(inHourse.getInhNumber());
            List<OutHourse> all = outHourseMapper.queryAll();
            return Result.OK(all);
        }

        return Result.FAIL();
    }

    @Override
    public Result deldata(OutHourse outHourse) {
        int i = outHourseMapper.delhis(outHourse);
        if(i>0){
            List<OutHourse> all = outHourseMapper.queryAll();
            return Result.OK(all);

        }
        return Result.FAIL();
    }
}
