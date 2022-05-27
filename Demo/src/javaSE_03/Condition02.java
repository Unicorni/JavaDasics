package javaSE_03;

import java.util.Scanner;

//运用 Java if 条件判断 属于哪个年龄段。
//创建扫描类对象，获取用户输入的年龄。
//使用 if…else if 语句判断用户属于哪个年龄段。
public class Condition02 {
    public static void main(String[] args) {
        // 用户输入年龄
        Scanner sc = new Scanner(System.in);
        // 定义年龄变量
        System.out.println("请输入你的年龄: ");
        int age = sc.nextInt();
        // if 条件判断用户所属年龄段
        if (age > 0 && age < 5) {
            System.out.println("你是婴儿");
        } else if (age >= 5 && age < 10) {
            System.out.println("您是儿童");
        } else if (age >= 10 && age < 18) {
            System.out.println("您是青少年");
        } else if (age >= 18 && age < 30) {
            System.out.println("您是青年人");
        } else if (age >= 30 && age < 40) {
            System.out.println("您是青壮年");
        } else if (age >= 40 && age < 50) {
            System.out.println("您是中年人");
        } else if (age >= 50 && age < 70) {
            System.out.println("您是中老年人");
        } else if (age >= 70 && age < 100) {
            System.out.println("您是老年人");
        } else if (age >= 100 && age < 140) {
            System.out.println("您是长寿老人");
        } else {
            System.out.println("您应该记错了");
        }

    }
}
