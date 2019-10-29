package basic_sorted;

public class quick_sort {
    public static void qiuck_sort(int[] a,int low,int high){
        int start =low;
        int end =high;
        int key=a[low];
        while(end>start) {
            while (end > start && a[end] >= key)
                end--;
            if (a[end] <= key) {
                int temp = a[end];
                a[end] = a[start];
                a[start] = temp;
            }
            while (end > start && a[start] <= key)
                start++;
            if (a[start] >= key) {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
        }
        if (start>low) quick_sort.qiuck_sort(a,low,start-1);
        if (end<=high) quick_sort.qiuck_sort(a,end+1,high);

    }
}
