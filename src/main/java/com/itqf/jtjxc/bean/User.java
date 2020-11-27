package com.itqf.jtjxc.bean;

/**
 * projectName: jtjxc
 *
 * @author: 赵伟风
 * time: 2020/11/24 9:38
 * description: 对应数据库users表!
 */
public class User {

    private Integer uId;
    private String uName;
    private String uAccount;
    private String uPassword;
    private  String usex;
    private String ujs;
    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuAccount() {
        return uAccount;
    }

    public void setuAccount(String uAccount) {
        this.uAccount = uAccount;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex;
    }

    public String getUjs() {
        return ujs;
    }

    public void setUjs(String ujs) {
        this.ujs = ujs;
    }

    @Override
    public String toString() {
        return "User{" +
                "uId=" + uId +
                ", uName='" + uName + '\'' +
                ", uAccount='" + uAccount + '\'' +
                ", uPassword='" + uPassword + '\'' +
                ", usex='" + usex + '\'' +
                ", ujs='" + ujs + '\'' +
                '}';
    }
}
