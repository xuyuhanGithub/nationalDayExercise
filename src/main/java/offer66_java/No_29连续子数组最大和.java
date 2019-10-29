package offer66_java;

/**
 * @author xuyuhan
 * @date 2019-10-22 19:16
 */

public class No_29连续子数组最大和 {
        public int FindGreatestSumOfSubArray(int[] array) {
            if(array.length==0)
                return 0;
            else{
                int total=array[0],maxSum=array[0];
                for(int i=1;i<array.length;i++){
                    if(total>=0)
                        total+=array[i];
                    else
                        total=array[i];
                    if(total>maxSum)
                        maxSum=total;
                }
                return maxSum;
            }

        }
    }
