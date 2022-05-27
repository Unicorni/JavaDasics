package JavaSE_01;

import java.util.Scanner;

public class Variable_03 {
//    运用 Java 变量计算圆柱体积。
    public static void main(String [] args){
        // 定义圆周率
        double p = 3.14;
        // 创建一个键盘输入扫描类对象
        Scanner sc = new Scanner(System.in);
        // 输入圆柱体的半径
        System.out.println("请输入圆柱体的底面半径:");
        double r = sc.nextDouble();
        // 输入圆柱体的高
        System.out.println("请输入圆柱体的高:");
        double h = sc.nextDouble();
        // 计算出圆柱体底面的面积
        double s = p * r * r;
        System.out.println("圆柱体底面的面积为：" + s);
        // 计算出圆柱体的体积
        double v = s * h;
        System.out.println("圆柱体的体积为：" + v);
    }
}
