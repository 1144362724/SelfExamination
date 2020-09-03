package test32;

import java.io.IOException;

/**
 * JPanel
 * 默认布局为 FlowLayout 流式布局
 */
public class MyApp {


    public static void main(String[] args) throws IOException {
        MyApp myApp = new MyApp();
        System.out.println(myApp.lessKeyCount(new int[]{1, 6,4,5,7, 8, 9, 10}, 3, 8));

    }

    /**
     * 返回大于Max 小于min 的个数
     *
     * @param a   数组
     * @param min 最小值
     * @param max 最大值
     * @return 大于Max 小于min 的个数
     */
    int lessKeyCount(int[] a, int min, int max) {
        int num = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > min  && a[i] < max) {
                System.out.println(a[i]);
                num++;
            }
        }
        return num;
    }
}

