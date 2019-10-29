package offer66_java;

/**
 * @author xuyuhan
 * @date 2019-10-21 15:52
 */

public class No_13数组奇数在偶数前 {
    public void reOrderArray(int [] array) {
        for(int i=0;i<array.length-1;i++)
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]%2==0 && array[j+1]%2==1){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
    }
}
