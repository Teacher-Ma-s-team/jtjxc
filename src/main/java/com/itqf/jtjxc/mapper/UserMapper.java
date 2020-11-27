package com.itqf.jtjxc.mapper;

import com.itqf.jtjxc.bean.Types;
import com.itqf.jtjxc.bean.User;

import java.util.List;

/**
 * projectName: jtjxc
 *
 * @author: 赵伟风
 * time: 2020/11/24 10:24
 * description:
 */
public interface UserMapper {
    /**
     * 数据库查询方式
     * 注意：只要不是根据id查询，返回的必须是集合！
     * @param user
     * @return
     */
    int insertUser(User user);//插入
    int updateUser(User user);
    int deleteUser(User user);//删除user数据库
    List<User> queryUser(User user);
    List<User> queryAll();


}
