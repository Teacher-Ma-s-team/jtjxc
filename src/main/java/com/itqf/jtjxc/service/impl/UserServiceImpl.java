package com.itqf.jtjxc.service.impl;

import com.itqf.jtjxc.bean.Result;
import com.itqf.jtjxc.bean.User;
import com.itqf.jtjxc.mapper.UserMapper;
import com.itqf.jtjxc.service.UserService;
import com.itqf.jtjxc.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.List;

/**
 * projectName: jtjxc
 *
 * @author: 赵伟风
 * time: 2020/11/24 9:48
 * description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Result login(User user) {
        // user的密码是未md5处理的！
        //需要md5加密的明文
        String str = user.getuPassword() + Constants.SALT;
        //md5加密api 返回加密后的秘文
        String md5Str = DigestUtils.md5DigestAsHex(str.getBytes());

        user.setuPassword(md5Str);
        //1.登录业务
        List<User> users = userMapper.queryUser(user);
        //2.判断返回值
        if (users != null && users.size() > 0) {
            //查询成功
            return Result.OK(users.get(0));
        }
        return Result.FAIL();
    }
}
