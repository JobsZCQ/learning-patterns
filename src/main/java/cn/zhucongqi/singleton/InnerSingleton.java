/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package cn.zhucongqi.singleton;

import cn.zhucongqi.singleton.beans.SingletonBean;

// Inner class Singleton
public class InnerSingleton implements ISingleton {

    private SingletonBean bean = null;

    private InnerSingleton(){
        if (null != InnerHolder.INSTANCE) {
            throw new RuntimeException("Just only one Instance can be create!");
        }
        bean = new SingletonBean();
    }

    //Serializable
    private Object readResolve() {
        return InnerHolder.INSTANCE;
    }

    public static InnerSingleton getInstance() {
        return InnerHolder.INSTANCE;
    }

    @Override
    public void logic() {
        System.out.println(this.bean);
    }

    private static class InnerHolder {
        private static final InnerSingleton INSTANCE = new InnerSingleton();
    }

    public SingletonBean getBean() {
        return bean;
    }
}
