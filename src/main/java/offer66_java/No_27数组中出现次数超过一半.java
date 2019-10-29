package offer66_java;

/**
 * @author xuyuhan
 * @date 2019-10-22 16:48
 */

import java.util.HashMap;
import java.util.Map;
/*
 * 利用map存值，找出存在最多的数字，若大于长度一半，返回此数，否则返回0
 */
public class No_27数组中出现次数超过一半 {
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array.length==0||array==null)
            return 0;
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<array.length;i++){
            if(map.containsKey(array[i])){
                map.put(array[i], map.get(array[i])+1);
            }else{
                map.put(array[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue()>array.length/2)
                return entry.getKey();
        }
        return 0;
    }
}

