package javaSE_04;
//运用 Java for 循环嵌套 输出指定图案 。
//
//        题目
//        使用 for 循环语句，在控制台打印出一个五行的三角形，效果如下:
//
//@
//@@
//@@@
//@@@@
//@@@@@
//
//        题目解决思路
//定义循环执行 5 次，循环变量从 1 到 5，代表一共 5 行。
//        定义内层循环执行 i 次，代表每行打印的个数是 i，这个 i 即为外层循环的循环变量。
//        在内层循环中输出符号，并且不换行。
//        每行符号打印结束之后,添加换行操作。
public class ForDemo06 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println("");
        }
    }
}
