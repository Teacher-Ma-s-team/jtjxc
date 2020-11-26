package com.itqf.jtjxc.mapper;

import com.itqf.jtjxc.bean.Types;

import java.util.List;

/**
 * projectName: jtjxc
 *
 * @author: 赵伟风
 * time: 2020/11/25 11:07
 * description:
 */
public interface TypesMapper {

    //SQL - DML（insert update delete） 返回值类型全是int
    //影响行数

    /**
     * 插入type的数据库操作
     * @param types
     * @return
     */
    int insertType(Types types);

    /**
     * 查询所有分类数据
     * @return 返回所有
     */
    List<Types> queryAll();

}
