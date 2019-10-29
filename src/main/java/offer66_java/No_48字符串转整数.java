package offer66_java;

/**
 * @author xuyuhan
 * @date 2019-10-27 20:07
 */

public class No_48字符串转整数 {

        public int StrToInt(String str1){

            if(str1.isEmpty())
                return 0;
            char[] str = str1.toCharArray();
            int symbol = 1;
            if(str[0] == '-'){//处理负号
                symbol = -1;
                str[0] = '0'; //这里是‘0’ 不是0
            }else if(str[0] == '+'){//处理正号
                symbol = 1;
                str[0] = '0';
            }
            int sum = 0;
            for(int i=0;i<str.length;++i){
                if(str[i] < '0' || str[i] > '9'){
                    sum = 0;
                    break;
                }

                sum = sum *10 + str[i] - '0';

            }
            return symbol * sum;



    }
}
