package JavaSE_01;

import java.util.Scanner;

public class Variable_02 {
       public static void main(String[] args) {
              /*
              请根据下列描述，选用合适的数据类型定义变量，并输出变量的值。
              班级里有 100 个学员。
              某商品价格 55.55 元。
              地球已经诞生超过 46 亿年。
              “5 是偶数” 这句话的描述是假的。
              */
              System.out.println("骇客网\n");
              int studentNumber = 100;   //学生数量
              System.out.println(studentNumber);
              double price = 55.55; // 商品价格
              System.out.println(price);
              long yearNumber = 4600000000L; // 超出int范围的整数
              System.out.println(yearNumber);
              boolean flag = false; // 真假值
              System.out.println(flag);
//              “5 是偶数” 这句话的描述是假的。
//              Java中=是赋值运算，而==判断值是否相等，===是判断的是值及类型是否完全相等，而===只在JavaScript中有
              java.util.Scanner s=new java.util.Scanner(System.in);
              System.out.println("请输入一个整数:");
              int n=s.nextInt();
              if (n%2==0) {
                     System.out.println(n+"是偶数");
              }else {
                     System.out.println(n+"是奇数");
              }
       }
}
