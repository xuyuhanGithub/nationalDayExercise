package hundsun;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author xuyuhan
 * @date 2019-10-25 15:45
 */

public class _2015_01 {
    public static void main(String[] args) throws IOException {
        File file = new File("sc.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        HashMap<String, Integer> map = new HashMap<>();
        String regex="\t|\r|\n|\"|\\,|\\\\.|\\\\:|\\\\?";
        String result=null;
        while ((result=br.readLine())!=null){
            String s = result.replace(regex, " ");
            String[] s1 = s.split(" ");
            for (int i=0;i<s1.length;i++){
                if (s1[i].equals(" ")){
                    continue;
                }
                if (map.containsKey(s1[i])){
                    map.put(s1[i],map.get(s1[i])+1);
                }
                else {
                    map.put(s1[i],1);
                }
            }
        }

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry:entries){
            System.out.println(entry.getKey() +":" +entry.getValue());
        }
    }
}
