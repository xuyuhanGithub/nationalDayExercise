package 设计模式.单例模式;

/**
 * @author xuyuhan
 * @date 2020-05-18 17:10
 */

public enum EnumSingle {
    INSTANCE;
    public  EnumSingle getInstance(){
        return INSTANCE;
    }
}
class Test{
    public static void main(String[] args) {
        EnumSingle instance1 = EnumSingle.INSTANCE;
    }
}
