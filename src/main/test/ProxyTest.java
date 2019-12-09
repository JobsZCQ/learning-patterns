import cn.zhucongqi.proxy.Walk;
import cn.zhucongqi.proxy.WalkFavorite;
import cn.zhucongqi.proxy.WalkInterceptor;
import cn.zhucongqi.proxy.WalkProxy;
import com.sun.org.apache.xpath.internal.axes.WalkingIterator;
import org.junit.Test;

/**
 * @author ：Jobsz
 * @project ：learning-patterns
 * @date ：Created in 2019/12/9 23:34
 * @description：
 * @modified By：
 * @version:
 */
public class ProxyTest {

    @Test
    public void testProxy() {
        Walk walkFavorite = new WalkFavorite("Jobsz");

        walkFavorite = WalkProxy.getProxy(walkFavorite, new WalkInterceptor());

        walkFavorite.to("北京");
    }
}
