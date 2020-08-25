package com.dns007.stock;
/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/23
 */
public class JiJin {
    private Gupiao gupiao;
    private Guozai guozai;
    private Qihuo qihuo;

    public JiJin(){
        this.guozai = new Guozai();
        this.gupiao = new Gupiao();
        this.qihuo = new Qihuo();
    }

    public void maiJijinA(){
        this.guozai.mai();
        this.gupiao.mai();
    }

    public void maiJijinB(){
        this.guozai.mai();
        this.gupiao.mai();
        this.qihuo.cao();
    }
}
