package hundsun;

/**
 * @author xuyuhan
 * @date 2019-10-29 20:32
 */

public class 转16进制 {
//    java语言参考答案
//
//            考察点
//
//    异常的处理；
//
//    io用完后的关闭；
//
//    文件的读；
//
//    字符编码的处理考虑；
//
//    buffer的使用；
//
//    重复使用的buffer是否重置；
//
//    byte转16进制；
//
//    publicstaticintdumpPrint(String file,intwidth,String charset)throwsIOException{
//
//        File dumpFile=newFile(file);
//
//        if(!dumpFile.exists()){
//
//            return-1;
//
//        }
//
//        if(dumpFile.isDirectory()){
//
//            return-1;
//
//        }
//
//        InputStream is=newFileInputStream(dumpFile);
//
//        byte[] buffer=newbyte[width];
//
//        intflag=is.read(buffer);
//
//        while(flag!=-1){
//
//            StringBuffer strBuffer=newStringBuffer();
//
//            for(inti=0;i<buffer.length;i++){
//
//                String hex=Integer.toHexString(buffer[i]&0xff);
//
//                strBuffer.append(hex).append(" ");
//
//            }
//
//            strBuffer.append("; ");
//
//            strBuffer.append(" ").append(newString(buffer,charset));
//
//            System.out.println(strBuffer);
//
//            buffer=newbyte[width];
//
//            flag=is.read(buffer);
//
//        }
//
//        is.close();
//
//
//        return0;
}
