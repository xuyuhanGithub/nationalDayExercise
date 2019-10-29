package offer66_java;

/**
 * @author xuyuhan
 * @date 2019-10-21 15:42
 */

public class No_11二进制1个数 {
    public int NumberOf1(int n) {
        int t=0;
        char[]ch=Integer.toBinaryString(n).toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='1'){
                t++;
            }
        }
        return t;
    }
}
