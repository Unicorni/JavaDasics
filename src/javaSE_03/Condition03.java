package javaSE_03;
//运用 Java switch 判断对应的数字为星期几。
//键盘录入一个 0 到 7 数字，使用 switch 输出这个数字对应的星期。
import java.util.Scanner;

public class Condition03 {
    public static void main(String[] args) {
        // 创建键盘扫描类
        Scanner sca =  new Scanner(System.in);
        // 输入月份
        System.out.println("请输入日期: ");
        int day =sca.nextInt(); // 0是周日，1是周一 ，2是周二，....
        switch (day){
            case 0:
                System.out.println("今天是周日");
                break;
            case 1:
                System.out.println("今天是周一");
                break;
            case 2:
                System.out.println("今天是周二");
                break;
            case 3:
                System.out.println("今天是周三");
                break;
            case 4:
                System.out.println("今天是周四");
                break;
            case 5:
                System.out.println("今天是周五");
                break;
            case 6:
                System.out.println("今天是周六");
                break;
            default:
                System.out.println("您输入的数据有误");
        }
    }
}
