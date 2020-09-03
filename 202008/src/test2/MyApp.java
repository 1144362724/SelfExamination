package test2;

/**
 * 转义字符
 */
public class MyApp {
    public static void main(String[] args){
        System.out.println("’\\n‘换行\n---换行 将当前位置移到下一行开头");
        System.out.println("-------------------");
        System.out.println("'\\r'回车\r---回车 当前位置移到本行开头\n");
        System.out.println("-------------------");
        System.out.println("‘\\t’水平制表\t---水平制表 跳到下一个TAB位置");
        System.out.println("-------------------");
        System.out.println("'\\b'退格\b---退格 将当前位置移到前一列");
        System.out.println("-------------------");
    }
}
