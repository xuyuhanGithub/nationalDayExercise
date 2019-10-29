package offer66_java;

import java.util.Arrays;

/**
 * @author xuyuhan
 * @date 2019-10-27 19:00
 */

public class No_44扑克牌顺子 {
    public boolean isContinuous(int [] numbers) {
        if(numbers == null)
            return false;
        Arrays.sort(numbers);  //先排序
        int zero = 0, i = 0;
        for(; i < numbers.length && numbers[i] == 0; i++){
            zero ++;  //统计0的个数
        }
        for(; i < numbers.length - 1 && zero >= 0; i++){
            if(numbers[i] == numbers[i+1]) //有对子，则返回false
                return false;
            if(numbers[i] + 1 + zero >= numbers[i+1]){  //可以继续匹配
                zero -= numbers[i+1] - numbers[i] - 1;
            }
            else
                return false;
        }
        if(i == numbers.length -1)
            return true;
        else
            return false;
    }
}
