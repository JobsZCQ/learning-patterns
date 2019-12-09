package cn.zhucongqi.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author ：Jobsz
 * @project ：learning-patterns
 * @date ：Created in 2019/12/9 23:22
 * @description：
 * @modified By：
 * @version:
 */
public class WalkProxy implements InvocationHandler {

    private Object target;
    private Interceptor interceptor;

    private WalkProxy(Object target, Interceptor interceptor) {
        this.target = target;
        this.interceptor = interceptor;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Invocation invocation = new Invocation(this.target, method, args);
        return this.interceptor.intercept(invocation);
    }

    public static Walk getProxy(Walk walk, Interceptor interceptor) {
        return (Walk)Proxy.newProxyInstance(walk.getClass().getClassLoader(), walk.getClass().getInterfaces(), new WalkProxy(walk, interceptor));
    }
}
