package hundsun;

import java.util.Scanner;

/**
 * @author xuyuhan
 * @date 2019-10-29 20:22
 */

public class 输入年月看一年第几天 {
    /*
     * 输入2017年的月和日:month=?,day=? 输出输入的日期是2017年的第几天，使用switch完成
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("month=");
        int month = sc.nextInt();

        System.out.print("day=");
        int day = sc.nextInt();

        int days = 0;

        switch (month) {


            case 12:
                days += 30;
            case 11:
                days += 31;

            case 10:
                days += 30;
            case 9:
                days += 31;
            case 8:
                days += 31;
            case 7:
                days += 30;
            case 6:
                days += 31;
            case 5:
                days += 30;

            case 4:
                days += 31;
            case 3:
                days += 28;
            case 2:
                days += 31;
            case 1:
                days += day;


        }

        if(days>365){
            System.out.println("你输入的已经超过了365天了");
        }else{
            System.out.println("第" + days + "天");
        }
    }

}
