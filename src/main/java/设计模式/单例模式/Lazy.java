package 设计模式.单例模式;

import java.util.ArrayList;

/**
 * @author xuyuhan
 * @date 2020-05-18 17:00
 */

public class Lazy {
    private Lazy(){

    }

    private volatile static Lazy lazy;

    public static Lazy getInstance(){
        if (lazy==null){
            synchronized (Lazy.class){
                if (lazy==null){
                    lazy=new Lazy();
                }
            }
        }

        return lazy;
    }
}
