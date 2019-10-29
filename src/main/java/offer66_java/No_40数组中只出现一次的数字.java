package offer66_java;

import java.util.HashSet;

/**
 * @author xuyuhan
 * @date 2019-10-27 16:43
 */

public class No_40数组中只出现一次的数字 {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0;i < array.length;i++){
            if(!set.add(array[i])){
                set.remove(array[i]);
            }
        }

        Object[] temp =set.toArray();
        num1[0] = (int) temp[0];
        num2[0] = (int) temp[1];
    }
}
