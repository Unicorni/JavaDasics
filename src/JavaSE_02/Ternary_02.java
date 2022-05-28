package JavaSE_02;
//Java三元运算符
public class Ternary_02 {
    /*题目
某小伙想定一份外卖，商家的优惠方式如下：鱼香肉丝单点 24 元，油炸花生米单点 8 元，米饭单点 3 元。
订单满 30 元 8 折优惠。鱼香肉丝优惠价 16 元，但是优惠价和折扣不能同时使用。那么这个小伙要点这三样东西，最少要花多少钱？
*
* */
public static void main(String [] args){
        System.out.println("开工了！！！\n");
        // 定义鱼香肉丝价格
        double fish = 24;
        // 定义油炸花生米价格
        double peanut = 8;
        // 定义米饭价格
        double rice = 3;
        // 计算出总价
        double total = fish + peanut + rice;
        // 判断是否符合优惠条件
        String bool = total >= 30 ?"符合优惠条件" : "不符合优惠条件";
        System.out.println(bool);
        // 使用优惠价的价钱
        double result1 = 16 + peanut + rice;
        System.out.println("使用优惠价的价钱" + result1);
       // 使用折扣的价钱
        double result2 = total * 0.8;
        System.out.println("使用折扣价的价钱" + result2);
        // 得出价格更少的消费方式
        String str = result1 <= result2 ? "使用优惠价格便宜":"使用折扣价格便宜";
        System.out.println(str);
    }
}
