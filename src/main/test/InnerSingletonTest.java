/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

import cn.zhucongqi.singleton.ISingleton;
import cn.zhucongqi.singleton.InnerSingleton;
import cn.zhucongqi.singleton.utils.ConcurrentExecutor;

import java.lang.reflect.Constructor;

public class InnerSingletonTest {

    public static void main(String[] args) throws Exception {
//        Class clazz = InnerSingleton.class;
//        Constructor constructor = clazz.getDeclaredConstructor(null);
//        constructor.setAccessible(true);
//        ISingleton singleton = (ISingleton) constructor.newInstance();
//        singleton.logic();
//
        ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler() {
            @Override
            public void handler() {
                ISingleton singleton = InnerSingleton.getInstance();
                singleton.logic();
            }
        }, 10, 10);


    }
}
