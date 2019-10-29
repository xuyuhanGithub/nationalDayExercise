package offer66_java;

/**
 * @author xuyuhan
 * @date 2019-10-21 15:26
 */

import java.util.ArrayList;
public class No_06旋转数组最小数字 {
    public int minNumberInRotateArray(int [] array) {

            int low = 0 ; int high = array.length - 1;
            while(low < high){
                int mid = low + (high - low) / 2;
                if(array[mid] > array[high]){
                    low = mid + 1;
                }else if(array[mid] == array[high]){
                    high = high - 1;
                }else{
                    high = mid;
                }
            }
            return array[low];
        }
}
