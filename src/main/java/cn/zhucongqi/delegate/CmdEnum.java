/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package cn.zhucongqi.delegate;

public enum CmdEnum {

    Java("Java"),
    Cpp("Cpp"),
    Python("Python");

    private String cmd;

    CmdEnum(String cmd) {
        this.cmd = cmd;
    }

    public String val() {
        return this.cmd;
    }

    public static final CmdEnum val(String byVal) {
        if (Java.val().equals(byVal)) {
            return Java;
        }

        if (Cpp.val().equals(byVal)) {
            return Cpp;
        }

        if (Python.val().equals(byVal)) {
            return Python;
        }
        return null;
    }
}
