package com.dns007;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/25
 */
//调用处理器
public class MyHandler implements InvocationHandler {
    private RealSubject realSubject;

    public void setRealSubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;
        dazhe();
        result = method.invoke(realSubject, args);
        give();
        return result;
    }

    public void dazhe(){
        System.out.println("打折");
    }

    public void give(){
        System.out.println("赠送代金券");
    }
}
