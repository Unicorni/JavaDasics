package javaSE_03;

import java.util.Scanner;

//判断超过五米的
public class Condition {
    public static void main(String[] args) {
        // 创建一个键盘输入扫描类对象
        Scanner sc = new Scanner(System.in); //Scanner 是干囊了
        System.out.println("请输入一个数:");
        int age = sc.nextInt();
        if (age != 0) {
            if (age >= 5) {
                System.out.println("超过五米");
            }else {    //else ao是
                System.out.println("小于五米");
            }
        }

    }
}
