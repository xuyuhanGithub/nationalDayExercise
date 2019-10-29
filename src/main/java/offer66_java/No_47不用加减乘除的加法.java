package offer66_java;

import java.math.BigInteger;

/**
 * @author xuyuhan
 * @date 2019-10-27 20:05
 */

public class No_47不用加减乘除的加法 {
    public int Add(int num1,int num2) {
        BigInteger bi1=new BigInteger(String.valueOf(num1));
        BigInteger bi2=new BigInteger(String.valueOf(num2));
        return bi1.add(bi2).intValue();

    }
}
