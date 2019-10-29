package offer66_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author xuyuhan
 * @date 2019-10-27 17:00
 */

public class No_41和为s的两个数 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            if (array == null || array.length < 2) {
                return list;
            }
            int i=0,j=array.length-1;
            while(i<j){
                if(array[i]+array[j]==sum){
                    list.add(array[i]);
                    list.add(array[j]);
                    return list;
                }else if(array[i]+array[j]>sum){
                    j--;
                }else{
                    i++;
                }

            }
            return list;
        }
}
