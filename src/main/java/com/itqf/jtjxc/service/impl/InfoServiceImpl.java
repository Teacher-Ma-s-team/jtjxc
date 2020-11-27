package com.itqf.jtjxc.service.impl;

import com.itqf.jtjxc.bean.Info;
import com.itqf.jtjxc.bean.Result;
import com.itqf.jtjxc.mapper.InfoMapper;
import com.itqf.jtjxc.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LFZ
 * @date 2020-11-26 - 18:32
 */
@Service
public class InfoServiceImpl implements InfoService {

    @Autowired
    private InfoMapper infoMapper;

    @Override
    public Result queryAll() {

        List<Info> infos = infoMapper.queryAll();

        return Result.OK(infos);
    }

    @Override
    public Result insert(Info info) {
        int i = infoMapper.insert(info);
        if(i>0){
            List<Info> infos = infoMapper.queryAll();
            return Result.OK(infos);
        }
        return Result.FAIL();
    }

    @Override
    public Result delete(Integer iId) {

        int i = infoMapper.delete(iId);
        if(i>0){
            List<Info> infos = infoMapper.queryAll();
            return Result.OK(infos);
        }
        return Result.FAIL();
    }
}
