/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package cn.zhucongqi.prototype;

import cn.zhucongqi.prototype.PrototypeBean;

import java.util.Arrays;
import java.util.Date;

public class PrototypeTest {
    public static void main(String[] args) {
        PrototypeBean bean = new PrototypeBean();
        bean.setPrototypeName("Name");
        bean.setPrototypeDate(new Date());

        try {
            PrototypeBean clone = bean.clone();
            System.out.println("bean = " + bean.getPrototypeDate().hashCode());
            System.out.println("clone = " + clone.getPrototypeDate().hashCode());
            System.out.println("深克隆：" + (bean.getPrototypeDate() == clone.getPrototypeDate()));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
