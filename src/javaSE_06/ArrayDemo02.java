package javaSE_06;
//Java遍历数组
//        创建一个长度为 5 的 整数 数组,并为数组中的元素赋值，并遍历数组。
//
//        题目
//        请使用静态初始化的方式，创建一个长度为 5 的整数数组，并为数组中的元素赋值，遍历数组,在同一行打印所有元素，元素之间用空格隔开，比如：如果数组为 { 1,2,3,4,5 } 则打印结果为：1 2 3 4 5
//
//        题目解决思路
//        定义数组，使用静态初始化方式为元素赋值。
//        使用 for 循环 对数组进行遍历。
//        逐个打印数组元素，打印元素不换行，在输出元素的后面拼接空格。
public class ArrayDemo02 {
    public static void main(String[] args) {
        // 定义int数组,使用静态初始化方式为元素赋值
        int [] arr1 = new int [] {1,2,3,4,5};
        System.out.println("数组元素如下：");
        // 使用for循环对数组进行遍历，逐个打印数组元素
        for (int i = 0; i < arr1.length; i++) {   //length 长度
            System.out.print(arr1[i] + " ");
        }
    }
}
