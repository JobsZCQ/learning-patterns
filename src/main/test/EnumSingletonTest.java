/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

import cn.zhucongqi.singleton.EnumSingleton;
import cn.zhucongqi.singleton.ISingleton;
import cn.zhucongqi.singleton.utils.ConcurrentExecutor;

public class EnumSingletonTest {
    public static void main(String[] args) throws Exception{

        ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler() {
            @Override
            public void handler() {
                ISingleton singleton = EnumSingleton.getInstance();
                singleton.logic();
            }
        }, 10, 10);
    }
}
