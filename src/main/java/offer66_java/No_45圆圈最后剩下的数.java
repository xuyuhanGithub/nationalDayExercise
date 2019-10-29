package offer66_java;

/**
 * @author xuyuhan
 * @date 2019-10-27 19:48
 */

public class No_45圆圈最后剩下的数 {
    public int LastRemaining_Solution(int n, int m)
    {
        if(n==0||m==0)return -1;
        int s=0;
        for(int i=2;i<=n;i++)
        {
            s=(s+m)%i;
        }
        return s ;
    }
}
