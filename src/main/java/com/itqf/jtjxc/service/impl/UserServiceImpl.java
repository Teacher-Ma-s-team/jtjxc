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
    @Override
    public Result show() {//查询

        List<User> usersList = userMapper.queryAll();

        if (usersList != null && usersList.size() > 0) {

            return Result.OK(usersList);
        }

        return Result.FAIL();
    }
    @Override
    public Result deuser(User user){
        //user删除数据库信息
        int rows=userMapper.deleteUser(user);
        //判断是否删除成功
        if(rows>0){
            List<User> userList=userMapper.queryAll();
            return Result.OK(userList);
        }
        return Result.FAIL();
    }
    @Override
    public Result inuser(User user){
        //插入
        int rows =userMapper.insertUser(user);
        //判断是否插入成功
        if(rows>0){
            //成功查询所有员工数据并返回显示
            List<User> userList=userMapper.queryAll();
            return Result.OK(userList);
        }
        return Result.FAIL();
    }
    @Override
    public Result upuser(User user){

        //1.types更新数据库信息
        int rows = userMapper.updateUser(user);
        //2.判断是否更新成功
        if(rows > 0){
            //3.更新成功  查询所有数据并返回显示
            List<User> userList=userMapper.queryAll();
            return Result.OK(userList);
        }
        return Result.FAIL();
    }

    @Override
    public Result updatePassword(Integer uId, String oldPassword, String newPassword) {
        User user = userMapper.queryById(uId);
        if(user!=null){

            String str = oldPassword + Constants.SALT;
            String oldPW = DigestUtils.md5DigestAsHex(str.getBytes());
            if(user.getuPassword().equals(oldPW)){
                String newStr = newPassword + Constants.SALT;
                String newPW = DigestUtils.md5DigestAsHex(newStr.getBytes());
                user.setuPassword(newPW);
                int i = userMapper.updateUser(user);
                if(i>0){
                    return Result.OK();
                }
            }
        }

        return Result.FAIL();
    }
}
