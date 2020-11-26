package com.itqf.jtjxc.service.impl;

import com.itqf.jtjxc.bean.Result;
import com.itqf.jtjxc.bean.Types;
import com.itqf.jtjxc.mapper.TypesMapper;
import com.itqf.jtjxc.service.TypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * projectName: jtjxc
 *
 * @author: 赵伟风
 * time: 2020/11/25 11:04
 * description:
 */
@Service
public class TypesServiceImpl implements TypesService {

    @Autowired
    private TypesMapper typesMapper;

    @Override
    public Result save(Types types) {

        //1.types插入到数据库
        int rows = typesMapper.insertType(types);
        //2.判断是否插入成功
        if (rows > 0)
        {
            //3.成功查询所有类别数据返回显示
            List<Types> typeList = typesMapper.queryAll();

            return Result.OK(typeList);
        }
        return Result.FAIL();
    }

    @Override
    public Result show() {

        List<Types> typeList = typesMapper.queryAll();

        if (typeList != null && typeList.size() > 0) {

            return Result.OK(typeList);
        }

        return Result.FAIL();
    }
}
