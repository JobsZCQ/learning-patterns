package cn.zhucongqi.proxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author ：Jobsz
 * @project ：learning-patterns
 * @date ：Created in 2019/12/9 23:24
 * @description：
 * @modified By：
 * @version:
 */
public class Invocation {

    private Object target;
    private Method method;
    private Object[] args;

    public Invocation(Object target, Method method, Object[] args) {
        this.target = target;
        this.method = method;
        this.args = args;
    }

    public Object process() {
        try {
            return this.method.invoke(this.target, this.args);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
