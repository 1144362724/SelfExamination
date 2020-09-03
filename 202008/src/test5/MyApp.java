package test5;

import java.util.Vector;

/**
 * Vector
 */
public class MyApp {


    public static void main(String[] args){
        Vector<String> vector = new Vector<String>();
        //添加
        vector.add("添加数据1");
        vector.add("添加数据2");
        vector.add("添加数据3");
        //删除指定位置数据
        vector.removeElementAt(2);
        //删除指定对象
        vector.removeElement("添加数据2");
        //删除全部数据
        vector.removeAllElements();

        vector.stream().forEach(System.out::println);
    }
}
