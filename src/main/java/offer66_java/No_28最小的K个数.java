package offer66_java;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Comparator;
/**
 * @author xuyuhan
 * @date 2019-10-22 18:57
 */

public class No_28最小的K个数 {
    public List<Integer> GetLeastNumbers_Solution(int[] input, int k) {
            List<Integer> result = new ArrayList<Integer>();
//        ArrayList<String> str = new ArrayList<>();
        int length = input.length;
            if(k > length || k == 0){
                return result;
            }
            PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(k, new Comparator<Integer>() {

                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2.compareTo(o1);
                }
            });
            for (int i = 0; i < length; i++) {
                if (maxHeap.size() != k) {
                    maxHeap.offer(input[i]);
                } else if (maxHeap.peek() > input[i]) {
                    Integer temp = maxHeap.poll();
                    temp = null;
                    maxHeap.offer(input[i]);
                }
            }
            for (Integer integer : maxHeap) {
                result.add(integer);
            }
            return result;


    }
    }
