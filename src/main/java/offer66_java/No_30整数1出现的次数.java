package offer66_java;

/**
 * @author xuyuhan
 * @date 2019-10-22 19:22
 */

public class No_30整数1出现的次数 {
        public int NumberOf1Between1AndN_Solution(int n) {
            int count=0;
            while (n>0){
                String str = String.valueOf(n);
                char[] chars = str.toCharArray();
                for (int i=0;i<chars.length;i++){
                    if(chars[i]=='1'){
                        count+=1;
                    }
                    n--;
                }
            }
            return count;
        }
    }

