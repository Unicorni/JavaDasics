package javaSE_05;
//随机产生一个 1-100 之间的数字，然后让玩家不断猜测，如果猜大，提示过大，如果猜小，提示过小，如果猜中则程序停止。
import java.util.Random;
import java.util.Scanner;

public class RandomDemo03 {
    public static void main(String[] args) {
        // 创建一个生产随机数的对象
        Random r = new Random();
        // 生成一个 1-100之间的随机数
        int result1 = r.nextInt(100) + 1;
        // 定义一个死循环，不停获取玩家输入的数字
        while (true){
            System.out.println("请输入数字：");
            // 创建扫描类对象
            Scanner sc = new Scanner(System.in);
            // 获取用户输入的数字
            int a = sc.nextInt();
            // 判断用户输入数字与答案数字大小

            if(a > result1){
                System.out.println("您输入的数字过大！");
            }else if(a < result1) {
                System.out.println("您输入的数字过小！");
            }else{
                System.out.println("您猜对了！");
                break;
            }
        }
    }
}
