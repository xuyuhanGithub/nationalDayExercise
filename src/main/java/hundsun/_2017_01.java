package hundsun;

import java.io.*;

/**
 * @author xuyuhan
 * @date 2019-10-25 16:35
 */

public class _2017_01 {
    public static void main(String[] args) throws IOException {
//        File file = new File("e:/a.txt");
////创建输入流
//        FileInputStream fis = null;
////创建输出流
//        FileOutputStream fos = null;
//        OutputStreamWriter osw = null;
//        PrintWriter pw = null;
//        try {
//            fis = new FileInputStream(file);
//            fos = new FileOutputStream("e:/c.txt");
//            String s = null;
//            int length = 0;
//            byte[] buf = new byte[1024];
//            while ((length = fis.read(buf)) != -1) {
////将小数从文件a.txt 读出来 并放到数组中
//                s = new String(buf, 0, length, "GBK");
//                String[] str = s.split(",");
//
//
//                double count = 0;
//                for (int i = 0; i < str.length; i++) {
////求小数和
//                    count += Double.parseDouble(str[i]);
//                }
////求平均值
//                double avg = count / str.length;
////使文件 c.txt写入数据
//                osw = new OutputStreamWriter(fos);
//                pw = new PrintWriter(osw);
////输入平均值
//                pw.println(avg);
//                System.out.println("成功输入");
//
//
//            }
////关闭流
//            osw.close();
//            pw.close();
//            fis.close();
//            fos.close();
//        } catch (IOException e) {
//// TODO: handle exception
//            e.printStackTrace();
//        } finally {
//            if (null != fis) {
//                try {
//                    fis.close();
//                } catch (IOException e) {
//                    fis = null;
//                }
//                if (null != fos) {
//
//
//                    try {
//                        fos.close();
//                    } catch (IOException e) {
//                        fos = null;
//                    }
//
//
//                }
//                if (null != osw) {
//                    try {
//                        osw.close();
//                    } catch (IOException e) {
//                        osw = null;
//                    }
//                }
//                if (null != pw) {
//                    try {
//                        pw.close();
//                    } catch (Exception e) {
//                        pw = null;
//                    }
//                }
//            }
//        }
//    }


        File file = new File("/Users/hay/Desktop/nationalDayExercise/src/main/java/hundsun/sc.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String result="";
        double count=0;
        int len=0;
        while ((result=br.readLine())!=null){
            String[] s1 = result.split(",");
            len=s1.length;
            for (int i=0;i<s1.length;i++){
                count+=Double.parseDouble(s1[i]);
            }
    }
        double avg = count / len;

        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/hay/Desktop/nationalDayExercise/src/main/java/hundsun/dst.txt"));
        bw.write(String.valueOf(avg));
        bw.flush();

        br.close();
        bw.close();
    }
}
