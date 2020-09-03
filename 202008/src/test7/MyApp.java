package test7;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 文件读取
 */
public class MyApp {


    public static void main(String[] args) throws IOException {
//        System.getProperty("user.home")
        File directory = new File(System.getProperty("user.dir")+"/202008/202008.iml");
        //user.dir指定了当前的路径
        System.out.println(System.getProperty("user.dir"));
        //获取标准的路径
        System.out.println(directory.getCanonicalPath());
        //获取绝对路径
        System.out.println(directory.getAbsolutePath());
        FileInputStream fileInputStream = new FileInputStream(directory);
        byte[] bytes = new byte[1000];
        //返回直接长度，(如果是文件结尾则返回 -1)
        int read = fileInputStream.read(bytes, 433, 1);
        System.out.println(read);
    }
}
