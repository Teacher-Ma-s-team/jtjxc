package com.itqf.jtjxc.service;

import com.itqf.jtjxc.bean.OutHourse;
import com.itqf.jtjxc.bean.Result;

/**
 * projectName: jtjxc
 *
 * @author: 葛帮帅
 * time: 2020/11/26 13:58
 * description:
 */
public interface OutHourseService {
    public Result save(OutHourse outHourse);
    public Result show();
    public Result showbyid(OutHourse outHourse);
    public Result changed(OutHourse outHourse);
    public Result deldata(OutHourse outHourse);
}
