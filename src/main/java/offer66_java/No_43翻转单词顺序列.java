package offer66_java;

/**
 * @author xuyuhan
 * @date 2019-10-27 18:57
 */

public class No_43翻转单词顺序列 {
    public String ReverseSentence(String str) {
        if(str == null){ return null;}
        if(str.trim().equals("")){
            return str;
        }
        String string = str;
        String[] strings = string.split(" ");
        StringBuilder sBuilder = new StringBuilder();
        for (int i = strings.length-1 ; i>=0;i--) {
            if(i == 0){
                sBuilder.append(strings[i]);
            }else {
                sBuilder.append(strings[i]);
                sBuilder.append(" ");
            }
        }

        String string2 = sBuilder.toString();
        return string2;
    }
}
