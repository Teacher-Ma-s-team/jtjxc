package com.itqf.jtjxc.bean;

/**
 * @author LFZ
 * @date 2020-11-26 - 18:05
 */
public class Info {
    private Integer iId;
    private Integer tId;
    private Integer pId;
    private Integer iQuantity;
    private String iNote;

    private String tName;
    private String pName;

    public Integer getiId() {
        return iId;
    }

    public void setiId(Integer iId) {
        this.iId = iId;
    }

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Integer getiQuantity() {
        return iQuantity;
    }

    public void setiQuantity(Integer iQuantity) {
        this.iQuantity = iQuantity;
    }

    public String getiNote() {
        return iNote;
    }

    public void setiNote(String iNote) {
        this.iNote = iNote;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    @Override
    public String toString() {
        return "Info{" +
                "iId=" + iId +
                ", tId=" + tId +
                ", pId=" + pId +
                ", iQuantity=" + iQuantity +
                ", iNote='" + iNote + '\'' +
                ", tName='" + tName + '\'' +
                ", pName='" + pName + '\'' +
                '}';
    }
}
