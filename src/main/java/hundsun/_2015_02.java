package hundsun;

/**
 * @author xuyuhan
 * @date 2019-10-25 16:16
 */

public class _2015_02 {

    public static int recursiveBinarySearch(int[] arr, int purpose, int bottom ,int top) {

        if (bottom > top)
            return -1;
        int mid = (bottom + top) / 2;
        if (arr[mid] == purpose)
            return mid;
        return arr[mid] > purpose ? recursiveBinarySearch(arr, purpose, bottom, mid - 1) :
                recursiveBinarySearch(arr, purpose, mid + 1, top);
    }

}
