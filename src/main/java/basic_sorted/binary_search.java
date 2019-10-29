package basic_sorted;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLService;

public class binary_search {


    public static int biSearch(int[] array ,int a){
        int lo=0;
        int hi=array.length-1;
        int mid;
        while(lo<hi){
            mid=(lo+hi)/2;
            if(array[mid]==a){
                return mid+1;
            }else if(array[mid]<a){
                lo=mid+1;
            }else {
                hi=mid-1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int M = 10;
        int[] a = new int[M];
        for(int i = 0; i < M; ++i)
            a[i] = i;
        System.out.printf("%d",biSearch(a,4));
    }
}
