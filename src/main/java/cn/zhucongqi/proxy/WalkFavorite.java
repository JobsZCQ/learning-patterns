package cn.zhucongqi.proxy;

/**
 * @author ：Jobsz
 * @project ：learning-patterns
 * @date ：Created in 2019/12/9 23:19
 * @description：
 * @modified By：
 * @version:
 */
public class WalkFavorite implements Walk {

    private String username;

    public WalkFavorite(String username) {
        this.username = username;
    }

    @Override
    public void to(String addr) {
        System.out.println(this.username + " like walk to " + addr + "!");
    }
}
