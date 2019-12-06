/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package cn.zhucongqi.delegate;

public interface IEmployee {

    //be good at something
    CmdEnum goodAt();

    default String doCmd(String cmd)  {
        return "I am "+ this.name() +", I am doing cmd " + cmd + " from leader now and I am good at " + this.goodAt();
    }

    String name();
}
