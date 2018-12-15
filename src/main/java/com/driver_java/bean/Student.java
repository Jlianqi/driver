package com.driver_java.bean;

import java.io.Serializable;

public class Student implements Serializable {

    private Integer sId;

    private String sDabh;

    private String sName;

    private Integer sType;

    private String sSfId;

    private String sTel;

    private String sDress;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsDabh() {
        return sDabh;
    }

    public void setsDabh(String sDabh) {
        this.sDabh = sDabh == null ? null : sDabh.trim();
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public Integer getsType() {
        return sType;
    }

    public void setsType(Integer sType) {
        this.sType = sType;
    }

    public String getsSfId() {
        return sSfId;
    }

    public void setsSfId(String sSfId) {
        this.sSfId = sSfId == null ? null : sSfId.trim();
    }

    public String getsTel() {
        return sTel;
    }

    public void setsTel(String sTel) {
        this.sTel = sTel == null ? null : sTel.trim();
    }

    public String getsDress() {
        return sDress;
    }

    public void setsDress(String sDress) {
        this.sDress = sDress == null ? null : sDress.trim();
    }
}
