/**
 * @author xuyuhan
 * @date 2019-10-23 16:21
 */

//public  class test{
//    static class X{
//        Y b=new Y();
//        X(){
//            System.out.println("X");
//        }
//    }
//    static class Y{
//        Y(){
//            System.out.println("Y");
//        }
//    }
//    public static class Z extends X{
//        Y y=new Y();
//        Z(){
//            System.out.println("Z");
//        }
//    }
//    public static void main(String[] args) {
//        new Z();
//    }
//}

class test{
    public static boolean isOdd(int i){
        return i%2==1;
    }
    public static void main(String[] args) {
//        boolean a=isOdd(5);
//        boolean b=isOdd(-5);
//        boolean c=isOdd(2147483647);
//        boolean d=isOdd(2147483647+2);
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
        System.out.println(Runtime.getRuntime().availableProcessors());

    }
}