/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package cn.zhucongqi.delegate;


public class CmdSenderTest {

    public static void main(String[] args) {
       Boss boss =  new Boss();
       boss.cmd(CmdEnum.Cpp);
       boss.cmd(CmdEnum.Java);
       boss.cmd(CmdEnum.Python);
    }
}
