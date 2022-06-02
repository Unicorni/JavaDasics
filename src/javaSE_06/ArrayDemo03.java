package javaSE_06;

import java.util.Random;

//Java数组
//        描述
//        获取 Java 数组 中的数据并进行运算。
//
//        题目
//        创建一个长度为 6 的 整数 数组，随机生成六个 0 (包含) - 100 (不包含) 之间的整数存放到数组中，然后计算出数组中所有元素的和并打印。
//
//        题目解决思路
//        定义长度为 6 的数组。
//        创建随机数 Random 类对象。
//        遍历数组，在循环中生成随机数并给数组元素赋值。
//        定义求和变量，初始化值为 0。
//        遍历数组，获取每一个元素,累加。
//        遍历结束，打印结果。
public class ArrayDemo03 {
    public static void main(String[] args) {
        // 定义长度为 6 的数组
        int [] arr1 = new int[6];
        // 定义变量存储计算结果
        int sum = 0;
        // 创建随机数Random类对象   Random 软的
        Random random = new Random();
        // 遍历数组,在循环中生成随机数并给数组元素赋值
        for (int i = 0; i < 6; i++) {
            arr1[i] = random.nextInt(100);
        }
        System.out.println("数组中的元素分别为：");
        // 遍历数组,获取每一个元素,累加
        for(int j = 0; j < arr1.length; j++){
            System.out.print(arr1[j] + " ");
            sum += arr1[j];
        }
        System.out.println("");
        // 遍历结束,打印结果
        System.out.println("数组元素的和为：" + sum);
    }
}
