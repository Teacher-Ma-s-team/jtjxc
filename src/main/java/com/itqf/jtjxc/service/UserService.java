package com.itqf.jtjxc.service;

import com.itqf.jtjxc.bean.Result;
import com.itqf.jtjxc.bean.User;

/**
 * projectName: jtjxc
 *
 * @author: 赵伟风
 * time: 2020/11/24 9:46
 * description:用户业务接口
 */
public interface UserService {
    /**
     * 登录的业务逻辑方法
     * @param user 传入的账号密码实体类
     * @return result结果判断实体
     */
    Result login(User user);
}
