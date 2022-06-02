package javaSE_04;
//Java for循环
//
//        描述
//        运用 Java for 循环 得出 1949 ~ 2019 是猪年的年份。
//
//        题目
//        在中国历法中有十二生肖年份，2019 年是己亥猪年,请在控制台输出从 1949 年(包含)到 2019 年(包含)中所有是猪年的年份。
//
//        题目解决思路
//        定义 for 循环，1949 到 2019 的年份是循环次数。
//        对每个年份逐个判断，如果年份和 2019 的差值是 12 的倍数，说明这年是猪年。
//        打印符合条件的年份。
public class ForDemo01 {
    public static void main(String[] args) {
        // 定义变量存储2019年
        int pigYear = 2019;
        // 定义变量存储十二生肖周期;
        int cycleYear= 12;
        // 定义for循环，1949年2019年份循环次数
        for (int i = 1949; i < 2019; i++) {
            if ((pigYear - i) % cycleYear == 0){
                System.out.println(i + "年是猪年");
            }else if(i == pigYear){
                System.out.println(i + "年是猪年");
            }
        }
    }
}
