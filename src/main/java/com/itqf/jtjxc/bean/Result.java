package com.itqf.jtjxc.bean;

import com.itqf.jtjxc.utils.Constants;

/**
 * projectName: jtjxc
 *
 * @author: 赵伟风
 * time: 2020/11/24 10:40
 * description：结构封装类
 */
public class Result {
    /**
      描述具体的返回状态码
     */
    private int ret = Constants.RET_FAIL;
    /**
     描述具体的返回提示信息
     */
    private String msg;
    /**
     具体返回的对象数据
     */
    private Object data = null;


    public Result(int ret, String msg, Object data) {
        this.ret = ret;
        this.msg = msg;
        this.data = data;
    }


    public static Result OK(){

        return new Result(Constants.RET_OK, null, null);
    }

    public static Result OK(String msg){

        return new Result(Constants.RET_OK, msg, null);
    }

    public static Result OK(Object data){

        return new Result(Constants.RET_OK, null, data);
    }

    public static Result OK(String msg,Object data){

        return new Result(Constants.RET_OK, msg, data);
    }


    public static Result FAIL(){

        return new Result(Constants.RET_FAIL, null, null);
    }

    public static Result FAIL(String msg){

        return new Result(Constants.RET_FAIL, msg, null);
    }

    public static Result FAIL(Object data){

        return new Result(Constants.RET_FAIL, null, data);
    }

    public static Result FAIL(String msg,Object data){

        return new Result(Constants.RET_FAIL, msg, data);
    }

    public int getRet() {
        return ret;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
