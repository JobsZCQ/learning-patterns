/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package cn.zhucongqi.singleton;

import cn.zhucongqi.singleton.beans.SingletonBean;

// Lazy Singleton with double check
public class DoubleCheckSingleton implements ISingleton{

    private static DoubleCheckSingleton instance = null;

    private SingletonBean bean = null;

    private DoubleCheckSingleton(){
        bean = new SingletonBean();
    }

    public static DoubleCheckSingleton getInstance() {
        if (null == instance) {
            synchronized (DoubleCheckSingleton.class) {
                if (null == instance) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }

    public SingletonBean getBean() {
        return bean;
    }

    //Serializable
    private Object readResolve() {
        return instance;
    }

    @Override
    public void logic() {
        System.out.println(this.bean);
    }
}
