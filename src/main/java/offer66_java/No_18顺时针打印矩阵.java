package offer66_java;

/**
 * @author xuyuhan
 * @date 2019-10-22 15:36
 */

public class No_18顺时针打印矩阵 {
}

//链接：https://www.nowcoder.com/questionTerminal/9b4c81a02cd34f76be2659fa0d54342a
//        来源：牛客网
//
//        #打印第一行，删除第一行，逆时针转动90度。重复以上步骤，直到矩阵为空。
//class Solution:
//        def printMatrix(self, matrix):
//        # write code here
//        s=[]
//        while matrix:
//        s+=matrix[0]
//        del matrix[0]
//        matrix=zip(*matrix)[::-1]
//        return s