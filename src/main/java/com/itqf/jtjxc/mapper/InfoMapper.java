package com.itqf.jtjxc.mapper;

import com.itqf.jtjxc.bean.Info;

import java.util.List;

/**
 * @author LFZ
 * @date 2020-11-26 - 18:16
 */
public interface InfoMapper {


    List<Info> queryAll();

    int insert(Info info);

    int delete(Integer iId);
}
