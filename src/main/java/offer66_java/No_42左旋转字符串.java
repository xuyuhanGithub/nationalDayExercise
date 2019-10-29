package offer66_java;

/**
 * @author xuyuhan
 * @date 2019-10-27 18:39
 */

public class No_42左旋转字符串 {
    public String LeftRotateString(String str,int n) {
        //保证旋转的位数大于字符串的长度，否则返回空字符串
        if(n>str.length())
            return "";
        //把原字符串截取成俩字符串，然后拼接
        String s1 = str.substring(0, n);
        String s2 = str.substring(n,str.length());
        return s2 + s1;
    }
}
