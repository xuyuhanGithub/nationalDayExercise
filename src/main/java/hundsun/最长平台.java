package hundsun;

/**
 * @author xuyuhan
 * @date 2019-10-29 20:24
 */

public class 最长平台 {
    int longest_plateau(int x[], int n)

    {

        int length = 1;  /* plateau lenth >= 1. */

        int i;

        for (i = 1; i < n; i++)

            if (x[i] == x[i - length])

                length++;

        return length;

    }
}
