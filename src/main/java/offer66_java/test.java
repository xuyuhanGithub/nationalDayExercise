package offer66_java;

import netscape.security.UserTarget;

/**
 * @author xuyuhan
 * @date 2019-10-21 15:42
 */
//
//public class test{
//    public static void main(String[] args) {
//        try{
//            int a=args.length;
//            long d=2;
//            int b=42/a;
//            int c[]={1};
//            c[42]=99;
//            System.out.println("b="+b);
//        }
//        catch (ArithmeticException e){
//            System.out.println("0异常"+e);
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("越界:"+e);
//        }
//    }
//}




//import java.lang.reflect.Array;
//import java.util.*;
//
//import static com.sun.tools.javac.jvm.ByteCodes.swap;
////public class test{
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        while(in.hasNext()){
//            String s1 = in.nextLine();
//            String s2 = in.nextLine();
//            String max = s1.length() >= s2.length()?s1:s2;
//            String min = s1.length() >= s2.length()?s2:s1;
//            long j =8888;
//
//            int l = 0;
//            String s ="";
//            for(int i=0;i<min.length();i++){
//                for(int j=i+1;j<=min.length();j++){
//                    if(max.contains(min.substring(i,j)) && j-i>l){
//                        l=j-i;
//                        s=min.substring(i,j);
//                    }
//                }
//            }
//            System.out.println(s);
//        }
//
//    }
//
//}

//


//public class test{
//    public static void main(String[] args) {
//        String str = new String("ABC123FDHG204");
//        char[] chars = str.toCharArray();
//        char[] chars1 = new char[chars.length];
//        int j=0;
//        for (int i=0;i<chars.length;i++){
//            if (chars[i]>='0'&&chars[i]<='9'){
//                chars1[j]=chars[i];
//                j++;
//            }
//        }
//
//        Arrays.sort(chars1);
//        System.out.println(chars1);
//
//        for (int i=j+1;i<chars1.length;i++){
//            System.out.println(chars1[i]);
//        }
//    }
//}

class test{

    public static void main(String[] args) {
        double v = 9.0 / 2;
        double v1 = 9 / 2 * 1.0;
    }
}
