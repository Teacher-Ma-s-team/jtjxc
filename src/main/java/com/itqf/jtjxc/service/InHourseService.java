package com.itqf.jtjxc.service;

import com.itqf.jtjxc.bean.InHourse;
import com.itqf.jtjxc.bean.Result;

/**
 * projectName: jtjxc
 *
 * @author: 葛帮帅
 * time: 2020/11/26 13:58
 * description:
 */
public interface InHourseService {
    public Result save(InHourse inHourse);
    public Result show();
    public Result showbyid(InHourse inHourse);
    public Result changed(InHourse inHourse);
    public Result deldata(InHourse inHourse);
}
