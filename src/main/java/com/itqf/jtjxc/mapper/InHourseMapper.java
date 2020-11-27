package com.itqf.jtjxc.mapper;

import com.itqf.jtjxc.bean.InHourse;

import java.util.List;

/**
 * projectName: jtjxc
 *
 * @author: 葛帮帅
 * time: 2020/11/26 13:46
 * description:入口业务接口
 */
public interface InHourseMapper {
    int inserthourse(InHourse inHourse);
    List<InHourse> queryAll();
    List<InHourse> querybyid(InHourse inHourse);
    int updatehourse(InHourse inHourse);
    int changed(InHourse inHourse);
    int delhis(InHourse inHourse);

}
