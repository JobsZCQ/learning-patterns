/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package cn.zhucongqi.singleton;

import cn.zhucongqi.singleton.beans.SingletonBean;

// Enum Singleton
public enum EnumSingleton implements ISingleton{

    INSTANCE;

    private SingletonBean bean = new SingletonBean();

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

    public SingletonBean getBean() {
        return bean;
    }

    @Override
    public void logic() {
        System.out.println(this.bean);
    }
}
