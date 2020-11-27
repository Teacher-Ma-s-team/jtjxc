package com.itqf.jtjxc.mapper;

import com.itqf.jtjxc.bean.OutHourse;

import java.util.List;

/**
 * projectName: jtjxc
 *
 * @author: 葛帮帅
 * time: 2020/11/26 13:46
 * description:入口业务接口
 */
public interface OutHourseMapper {
    int inserthourse(OutHourse outHourse);
    List<OutHourse> queryAll();
    List<OutHourse> querybyid(OutHourse outHourse);
    int updatehourse(OutHourse outHourse);
    int changed(OutHourse outHourse);
    int delhis(OutHourse outHourse);

}
