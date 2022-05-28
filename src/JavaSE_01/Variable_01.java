package JavaSE_01;

import java.sql.SQLOutput;

public class Variable_01 {
    public static void main(String[] args){
        System.out.println("骇客网\n");
        //拜特 定义byte类型变量,值为整数,只要在byte范围即可,byte范围:-128~127
        byte b=127;
        System.out.println(b);
        //数特 定义short类型变量,值为短整型,只要在-32768~32767范围即可
        short s =12345;
        System.out.println(s);
        // 整数的默认类型就是int类型
        int num =654321;
        System.out.println(num);
        //浪 定义long类型的长整数，需要在数据的后面加字母（L），大小写不限。
        long lo = 123456789L;
        System.out.println(lo);
        //富朗特  定义float类型的单精度浮点数，需要在数据的后面加字母（F），大小写不限。
        float f = 1.5F;
        System.out.println(f);
        // 浮点型默认类型double, 双精度浮点数.
        double d = 123.456;
        System.out.println(d);
        // 布尔型只有两个取值：true和false
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1);
        System.out.println(b2);
        // 定义字符型需要一对英文的单引号包裹，并且只能包含一个字符
        char c = 'a';
        System.out.println(c);
    }
}
