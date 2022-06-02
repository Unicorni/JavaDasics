package javaSE_06;
//运用 Java 数组 存储学生成绩，遍历数组 得出成绩最高的学生。
//
//        题目
//        使用 Java 数组存储学生成绩，计算出成绩最高的学生。
//
//        题目解决思路
//        定义一个 整数 数组存储学生成绩。
//        定义一个变量存储最大值，初始值为第一个学生成绩。
//        遍历数组，将数组中的成绩与最大值进行比较。
public class ArrayDemo04 {
    public static void main(String[] args) {
        // 定义数组存储学生成绩
        int [] arr = new int[] {90,100,98,99};
        // 定义 max 变量存储最大值，初始值为第一个学生成绩
        int max = arr[0];
        // 使用for循环遍历数组，并运用三元运算符 max 进行对比
        for (int i = 1; i < arr.length; i++) {
            max = arr[i] > max ? arr[i] : max ;
        }
        // 输出最大成绩
        System.out.println("最高成绩为：" + max);
    }
}
