package hundsun;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author xuyuhan
 * @date 2019-10-25 14:58
 */

public class _2011_02 {
    public static Integer[] swap(Integer[] a, Integer[] b){
        List<Integer> rs = new ArrayList<Integer>();
        HashSet<Integer> set1 = new HashSet<>();
        for (int c:a) {
            set1.add(c);
        }
        for (int c1:b){
            if(set1.contains(c1)){
                rs.add(c1);
            }
        }
        Integer[] arr = {};
        Integer[] integers = rs.toArray(arr);
        return integers;
    }
    public static void main(String[] args) {

        Integer[] m = { 1, 2, 3, 4, 5 };
        Integer[] n = { 3, 4, 6 };
        Integer[] swap = swap(m, n);
        for (Integer i:swap
             ) {
            System.out.println(i);
        }

    }
}
