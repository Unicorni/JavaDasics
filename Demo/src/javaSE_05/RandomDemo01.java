package javaSE_05;

import java.util.Random;

//Java随机数
//获取 0 到 9 内的随机数（包括 0 和 9）。
public class RandomDemo01 {
    public static void main(String[] args) {
        // 创建一个生产随机数的对象
        Random r = new Random();  // Random 软den
        // 通过对象方法获取随机数
        int data = r.nextInt(10);
        System.out.println(data);
    }
}
