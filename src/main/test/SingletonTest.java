/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

import cn.zhucongqi.singleton.DoubleCheckSingleton;
import cn.zhucongqi.singleton.ISingleton;
import cn.zhucongqi.singleton.Singleton;
import cn.zhucongqi.singleton.utils.ConcurrentExecutor;

public class SingletonTest {

    public static void main(String[] args) {
//        for (int i = 0; i < 3; i++) {
//            //test1
//            Singleton singleton = Singleton.getInstance();
//            System.out.println("running at thread" + Thread.currentThread().getName() + ">>" + singleton);
//        }


        //test2
        Runnable r = new Runnable() {
            @Override
            public void run() {
                Singleton singleton = Singleton.getInstance();
                System.out.println("running at thread" + Thread.currentThread().getName() + ">>" + singleton);
            }
        };
        new Thread(r).start();
        new Thread(r).start();
        new Thread(r).start();
        new Thread(r).start();
        new Thread(r).start();
    }
}