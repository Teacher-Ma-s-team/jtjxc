package com.itqf.jtjxc.bean;

/**
 * projectName: jtjxc
 *
 * @author: 赵伟风
 * time: 2020/11/25 10:55
 * description:数据库的类别实体类
 */
public class Types {

    private int tId;
    private int uId;
    private User user;
    private String tName;
    private String tDes;
    private String tNote;
    private int tWeight;

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String gettDes() {
        return tDes;
    }

    public void settDes(String tDes) {
        this.tDes = tDes;
    }

    public String gettNote() {
        return tNote;
    }

    public void settNote(String tNote) {
        this.tNote = tNote;
    }

    public int gettWeight() {
        return tWeight;
    }

    public void settWeight(int tWeight) {
        this.tWeight = tWeight;
    }
}
