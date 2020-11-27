package com.itqf.jtjxc.service;

import com.itqf.jtjxc.bean.Info;
import com.itqf.jtjxc.bean.Result;

/**
 * @author LFZ
 * @date 2020-11-26 - 18:30
 */
public interface InfoService {

    Result queryAll();

    Result insert(Info info);

    Result delete(Integer iId);
}
