package javaSE_04;
//Java for循环嵌套
//        描述
//        运用 Java for 循环 嵌套输出指定图案。
//
//        题目
//        使用 for 循环语句,在控制台打印出一个四行五列的长方形,效果如下:
//
//@@@@@
//@@@@@
//@@@@@
//@@@@@
//
//        题目解决思路
//定义循环执行 4 次，代表一共 4 行。
//        在循环内部再次定义循环执行 5 次，代表每行输出 5 个符号。
//        在内层循环中输出符号，并且不换行。
//        每行符号打印结束之后，添加一个换行操作。
public class ForDemo05 {
    public static void main(String[] args) {
        for(int i = 1; i <= 4; i++){
            for (int j = 1; j < 5; j++) {
                System.out.print("@");   //注意输出方式
            }
            System.out.println("");
        }
    }
}
