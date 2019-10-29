package hundsun;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xuyuhan
 * @date 2019-10-29 15:53
 */

public class 质数 {
    public static void serch(int n){
            List<Integer> list = new ArrayList<>();
            double sqrt = Math.sqrt(n);
            int i = 2;
            while (n >= 2) {
                if (n % i == 0) {
                    list.add(i);
                    n /= i;
                    i = 2;
                }else {
                    i++;
                }
            }
            int s = 1;
            for (Integer l : list){
                System.out.println(l);
                s *= l;
            }
            System.out.println(s);

        }

    }

