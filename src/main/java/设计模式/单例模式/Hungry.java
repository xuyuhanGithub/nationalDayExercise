package 设计模式.单例模式;

/**
 * @author xuyuhan
 * @date 2020-05-18 16:54
 */

public class Hungry {
    private Hungry(){

    }

    public final static Hungry HUNGRY=new Hungry();

    public static Hungry getInstance(){
        return HUNGRY;
    }
}
