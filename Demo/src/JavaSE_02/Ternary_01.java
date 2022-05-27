package JavaSE_02;
//Java三元运算符
public class Ternary_01 {
/*
* 题目
红茶妹妹有 21 元钱，她攒了几天钱之后自己的钱比原来的两倍还多三块。
绿茶妹妹有 24 元钱，她攒了几天钱之后自己的钱正好是原来的两倍。那么请问哪个妹妹攒的钱比较多?
* */
public static void main(String[] args) {
    System.out.println("骇客网\n");
    // 定义红茶妹妹原来的钱
    int red = 21;
    System.out.println("奶茶妹妹原来的钱:" + red);
    // 定义绿茶妹妹原来的钱
    int green = 24;
    System.out.println("绿茶妹妹原来的钱:" + green);
    // 求红茶妹妹现有的钱
    red= red*2+3;
    System.out.println("奶茶妹妹现有的钱:" + red);
    // 求绿茶妹妹现有的钱
    green *= 2;
    System.out.println("绿茶妹妹现有的钱:" + green);
    // 判断那个妹妹现有的钱更多
    String str =red>=green ? "红茶妹妹":"绿茶妹妹";
    System.out.println("现有的钱更多的是："+str);
  }
}
