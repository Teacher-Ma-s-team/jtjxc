package com.itqf.jtjxc.bean;

/**
 * projectName: jtjxc
 *
 * @author: 赵伟风
 * time: 2020/11/26 9:10
 * description:
 *  如果说。查询的时候涉及到了多表
 *  那么我们就应该去改造我们的实体
 *
 *
 *    {
 *        ret:1,
 *        msg:null,
 *        data:[
 *          {
 *              pid:1,
 *              tid:7,
 *              pname:xx,
 *              pprice:xxx,
 *              pdes:xx,
 *              pnote:xx,
 *              types:{
 *                  tid:xx,
 *                  tname:xxx,
 *                  tdes:xxx,
 *                  tnote:xxx
 *              }
 *          }
 *        ]
 *
 *
 *    }
 *
 */
public class Product {

    private int pId;
    private int tId;
    private int sId;
    private Size size;
    private Types types;
    private String pName;
    private String pPrice;
    private String pDes;
    private String pNote;

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public Types getTypes() {
        return types;
    }

    public void setTypes(Types types) {
        this.types = types;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpPrice() {
        return pPrice;
    }

    public void setpPrice(String pPrice) {
        this.pPrice = pPrice;
    }

    public String getpDes() {
        return pDes;
    }

    public void setpDes(String pDes) {
        this.pDes = pDes;
    }

    public String getpNote() {
        return pNote;
    }

    public void setpNote(String pNote) {
        this.pNote = pNote;
    }
}
