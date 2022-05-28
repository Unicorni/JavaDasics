package javaSE_06;
//Java定义数组
//        Java 数组 的定义格式分别为：静态初始化、动态初始化。
//
//        题目
//        使用静态初始化和动态初始化定义数组。
//
//        题目解决思路
//        静态初始化分为两种格式分别为：
//
//        a. 数据类型[] 数组名称 = new 数据类型[]{元素 1,元素 2,元素 3,…}
//
//        b. 数据类型[] 数组名称 = {元素 1,元素 2,元素 3,…}
//
//        动态初始化格式为：数据类型[] 数组名称 = new 数据类型[数组的长度]
public class ArrayDemo01 {
        public static void main(String[] args) {
                // 静态初始化定义数组
                int [] arr1 = new int [] {10,20,30};
                int [] arr2 = {10,20,30,40};
                // 动态初始化定义数组
                int [] arr3 = new int [5];
                // 打印三个数组
                System.out.println(arr1);
                System.out.println(arr2);
                System.out.println(arr3);
        }
}
