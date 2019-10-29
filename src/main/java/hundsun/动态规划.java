package hundsun;

/**
 * @author xuyuhan
 * @date 2019-10-27 15:10
 * 例如：
 *
 * str1="123ABCD4567"      str2 = "ABE12345D6"
 *
 * 最长公共子串是：123
 *
 * 最长公共子序列是：123456
 *
 * 最长公共子串的动态规划解法如下：
 * dp[i][j] -- 表示以str1[i]和str2[j]为结尾的最长公共子串
 *
 * 当str1[i] == str2[j]时，dp[i][j] = dp[i-1][j-1] + 1;
 *
 * 否则，dp[i][j] = 0;
 *
 * 最优解为max(dp[i][j]),其中0<=i<len1, 0<=j<len2;
 * ————————————————
 * 版权声明：本文为CSDN博主「咩哈哈丶」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/qbyhqp/article/details/82050121
 */

import java.util.Scanner;


public class 动态规划 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNextLine()) {
//            String str1 = scanner.nextLine().toLowerCase();
//            String str2 = scanner.nextLine().toLowerCase();
//            System.out.println(getCommonStrLength(str1, str2));
//        }
//    }
//
//    private static int getCommonStrLength(String str1, String str2) {
//        int len1 = str1.length();
//        int len2 = str2.length();
//        int[][] dp = new int[len1 + 1][len2 + 1];
//        for (int i = 0; i <= len1; i++) {
//            for (int j = 0; j <= len2; j++) {
//                dp[i][j] = 0;
//            }
//        }
//        for (int i = 1; i <= len1; i++) {
//            for (int j = 1; j <= len2; j++) {
//                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
//                    dp[i][j] = dp[i - 1][j - 1] + 1;
//                } else {
//                    dp[i][j] = 0;
//                }
//            }
//        }
//        int max = 0;
//        for (int i = 0; i <= len1; i++) {
//            for (int j = 0; j <= len2; j++) {
//                if (dp[i][j] > max) {
//                    max = dp[i][j];
//                }
//            }
//        }
//        return max;
//    }




    public static String maxSubstring(String strOne, String strTwo){
        // 参数检查
        if(strOne==null || strTwo == null){
            return null;
        }
        if(strOne.equals("") || strTwo.equals("")){
            return null;
        }
        // 二者中较长的字符串
        String max = "";
        // 二者中较短的字符串
        String min = "";
        if(strOne.length() < strTwo.length()){
            max = strTwo;
            min = strOne;
        } else{
            max = strTwo;
            min = strOne;
        }
        String current = "";
        // 遍历较短的字符串，并依次减少短字符串的字符数量，判断长字符是否包含该子串
        for(int i=0; i<min.length(); i++){
            for(int begin=0, end=min.length()-i; end<=min.length(); begin++, end++){
                current = min.substring(begin, end);
                if(max.contains(current)){
                    return current;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        long a=2;
        String strOne = "i love hundsun";
        String strTwo = "hundsun love me";
        String result = 动态规划.maxSubstring(strOne, strTwo);
        System.out.println(result);
    }

}

