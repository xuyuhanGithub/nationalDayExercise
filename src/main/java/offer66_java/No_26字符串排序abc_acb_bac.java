package offer66_java;

import java.util.ArrayList;
import java.util.Stack;
import java.util.TreeSet;

/**
 * @author xuyuhan
 * @date 2019-10-22 16:27
 */

public class No_26字符串排序abc_acb_bac {
        public ArrayList<String> Permutation(String str) {
            TreeSet<String> tree = new TreeSet<>();
            Stack<String[]> stack = new Stack<>();
            ArrayList<String> results = new ArrayList<>();
            stack.push(new String[]{str,""});
            do{
                String[] popStrs = stack.pop();
                String oldStr = popStrs[1];
                String statckStr = popStrs[0];
                for(int i =statckStr.length()-1;i>=0;i--){
                    String[] strs = new String[]{statckStr.substring(0,i)+statckStr.substring(i+1),oldStr+statckStr.substring(i,i+1)};
                    if(strs[0].length()==0){
                        tree.add(strs[1]);
                    }else{
                        stack.push(strs);
                    }
                }
            }while(!stack.isEmpty());
            for(String s : tree)
                results.add(s);
            return results;
        }
}
