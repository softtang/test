package com.tz.entity;

/**
 * Created by tangzhe on 2017/11/3.
 */
public class Test {
    private Integer tno;
    private String tname;

    public Integer getTno() {
        return tno;
    }

    public void setTno(Integer tno) {
        this.tno = tno;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public Test() {
    }

    public Test(Integer tno, String tname) {
        this.tno = tno;
        this.tname = tname;
    }
}
