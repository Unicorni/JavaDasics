package javaSE_03;
//Java if条件判断
/*
* 李雷想买一个价值 7988 元的新手机,他的旧手机在二手市场能卖 1500 元,
* 而手机专卖店推出以旧换新的优惠,
* 把他的旧手机交给店家,新手机就能够打 8 折优惠。
* */
public class Condition01 {
    public static void main(String [] args){
        System.out.println("极客小志。。。判断");
        // 定义新手机的价格
        double newPhone = 7988;
        // 定义旧手机的价格
        double oldPhone = 1500;
        // 计算不使用以旧换新时的花费
        double result1 = newPhone - oldPhone;
        // 计算机使用以旧换新的花费
        double result2 = newPhone * 0.8;
        // 比较哪种方式更加省钱
        if(result1<=result2){
            System.out.println("不使用以旧换新更省钱，所需花费为：" + result1);
        }else {
            System.out.println("使用以旧换新更省钱，所需花费为：" + result2);
        }


    }
}
