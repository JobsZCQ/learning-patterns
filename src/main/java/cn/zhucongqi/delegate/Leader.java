/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package cn.zhucongqi.delegate;

import java.util.HashMap;
import java.util.Map;

public class Leader {

    private Map<CmdEnum, IEmployee> employees = new HashMap<CmdEnum, IEmployee>();

    public Leader() {
        IEmployee employee = new EmployeeA();
        employees.put(employee.goodAt(), employee);
        employee = new EmployeeB();
        employees.put(employee.goodAt(), employee);
        employee = new EmployeeC();
        employees.put(employee.goodAt(), employee);
    }

    public String doCmd(String cmd) {
        System.out.println("I am leader and I am doing the cmd " + cmd + " from Boss.");
        CmdEnum cmdEnum = CmdEnum.val(cmd);
        return employees.get(cmdEnum).doCmd(cmdEnum.val());
    }
}
