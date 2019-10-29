package offer66_java;

/**
 * @author xuyuhan
 * @date 2019-10-21 15:29
 */

public class No_07斐波那契数列 {
    public int Fibonacci(int n) {
        int a=1,b=1,c=0;
        if(n<0){
            return 0;
        }else if(n==1||n==2){
            return 1;
        }else{
            for (int i=3;i<=n;i++){
                c=a+b;
                b=a;
                a=c;
            }
            return c;
        }
    }
}
