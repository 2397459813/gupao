package com.liu.beanutils;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;

public class App {
    public static void main( String[] args ) throws IllegalAccessException, InvocationTargetException {
        Model01 model01 = new Model01();
        Model02 model02 = new Model02();
        model01.setName("jack66");
        model01.setAge(12);
        model01.setCity("gz11111");
        
        
        model02.setName("henry");
        model02.setAge("38");
        model02.setCity("sz");
        BeanUtils.copyProperties(model01,model02);
        System.out.println(model01);
        System.out.println(model02);
    }
}
