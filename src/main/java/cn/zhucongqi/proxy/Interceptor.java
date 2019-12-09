package cn.zhucongqi.proxy;

/**
 * @author ：Jobsz
 * @project ：learning-patterns
 * @date ：Created in 2019/12/9 23:24
 * @description：
 * @modified By：
 * @version:
 */
public interface Interceptor {

    Object intercept(Invocation invocation);

}
