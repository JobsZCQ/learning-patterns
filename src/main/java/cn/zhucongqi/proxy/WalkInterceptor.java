package cn.zhucongqi.proxy;

/**
 * @author ：Jobsz
 * @project ：learning-patterns
 * @date ：Created in 2019/12/9 23:35
 * @description：
 * @modified By：
 * @version:
 */
public class WalkInterceptor implements Interceptor {

    public Object intercept(Invocation invocation) {
        System.out.println("before call");
        Object obj = invocation.process();
        System.out.println("after call");
        return obj;
    }
}
