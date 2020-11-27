package com.itqf.jtjxc.bean;

/**
 * projectName: jtjxc
 *
 * @author: 葛帮帅
 * time: 2020/11/26 13:43
 * description:入库类
 */
public class InHourse {
    private int inhId;
    private int tId;
    private String pName;
    private int inhNumber;
    private String intime;

    public int getInhId() {

        return inhId;
    }

    public void setInhId(int inhId) {
        this.inhId = inhId;
    }

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getInhNumber() {
        return inhNumber;
    }

    public void setInhNumber(int inhNumber) {
        this.inhNumber = inhNumber;
    }

    public String getIntime() {
        return intime;
    }

    public void setIntime(String intime) {
        this.intime = intime;
    }
}
