package 设计模式.单例模式;

/**
 * @author xuyuhan
 * @date 2020-05-18 17:05
 */

public class Holder {
    private Holder(){

    }

    public static Holder getInstance(){
        return InnerClass.holder;
    }

    public static class InnerClass{
        private final static Holder holder =new Holder();
    }
}
