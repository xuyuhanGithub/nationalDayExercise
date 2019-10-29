package basic_sorted;

public class insert_sort {
    public static void insert_sort(int[] array){
        for (int i=1;i<array.length;i++){
            int insertVal=array[i];
            int index=i-1;
            while(index>=0&&insertVal<array[index]){
                array[index+1]=array[index];
                index--;
            }
            array[index+1]=insertVal;
        }
    }
}
