package offer66_java;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author xuyuhan
 * @date 2019-10-28 09:20
 */

public class No_53字符流中第一个不重复的数值 {
    LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
    public void Insert(char ch)
    {

        if (map.containsKey(ch)){
            map.put(ch,map.get(ch)+1);
        }else {
            map.put(ch,0);
        }
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        for (Map.Entry<Character, Integer> set: map.entrySet()) {
            if (set.getValue()==0){
                return set.getKey();
            }
        }
        return '#';
    }
}
