package offer66_java;

import java.util.HashMap;

/**
 * @author xuyuhan
 * @date 2019-10-27 16:14
 */

public class No_37数字在排序数组的出现次数 {
    public static int countNum(int[] num,int n){
        int count=0;
        HashMap<Integer, Integer> countMap = new HashMap<>();
        countMap.put(n,0);
        for (int i=0;i<num.length;i++){
            if (num[i]==n){
                countMap.put(n,countMap.get(n)+1);
            }
        }
        return countMap.get(n);
    }

    public static void main(String[] args) {
        int[] num={1,2,2,3,4,5};
        System.out.println(countNum(num,2));
    }
}
