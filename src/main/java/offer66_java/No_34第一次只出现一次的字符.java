package offer66_java;

import java.util.ArrayList;
import java.util.List;
/**
 * @author xuyuhan
 * @date 2019-10-27 15:49
 */

public class No_34第一次只出现一次的字符 {

    public class Solution {
        public int FirstNotRepeatingChar(String str) {
            if(str == null || str.length()==0) return -1;
            List<Character> list = new ArrayList<>();
            for(int i=0;i<str.length();i++){
                char ch = str.charAt(i);
                if(!list.contains(ch)){
                    list.add(Character.valueOf(ch));
                }else{
                    list.remove(Character.valueOf(ch));
                }
            }
            if(list.size() <=0) return -1;
            return str.indexOf(list.get(0));
        }
    }

    public static void main(String[] args) {
        String s="xuyuhan";
        System.out.println(s.charAt(2));
    }
}
