package basic_sorted;

public class bubbleSort1 {
    public static void bubbleSort1(int[] a){
        int i,j;
        int n=a.length-1;
        for (i=0;i<n;i++){
            for (j=1;j<n-i;j++){
                if (a[j-1] > a[j]){
                    int temp;
                    temp=a[j-1];
                    a[j-1]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int M = 10;
        int[] a = new int[M];
        for(int i = 0; i < M; ++i)
            a[i] = i;
        bubbleSort1(a);
        for (int i=0;i < M;++i) {
            System.out.println(a[i]);
        }
    }
}
