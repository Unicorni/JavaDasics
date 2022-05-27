package javaSE_05;
//运用 Java 的 Random 函数得到区间随机数。
//实现区间随机数的生成：
//
//生成一个 1-10 之间的随机数。
//生成一个 3-15 之间的随机数。
//生成一个 5-999 之间的随机数。
import java.util.Random;

public class RandomDemo02 {
    public static void main(String[] args) {
        // 创建一个生产随机数的对象
        Random r = new Random();
        // 生成一个 1-10之间的随机数
        int result1 = r.nextInt(10) + 1;
        System.out.println("1-10之间的随机数:" + result1);
        // 生成一个 3-15之间的随机数
        int result2 = r.nextInt(13) + 3;
        System.out.println("3-15之间的随机数:" + result2);
        // 生成一个 5-999之间的随机数
        int result3 = r.nextInt(995) + 5;
        System.out.println("5-999之间的随机数:" + result3);
    }
}
