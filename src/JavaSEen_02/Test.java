package JavaSEen_02;
//Java抽象类
public class Test {
    public static void main(String[] args) {
        System.out.println("极客小志。。。的思考\n");
        // 教练员
        Coach coach = new Coach("01","张教官","男","30");
        System.out.print(coach.getName() + " ");
        coach.eat();
        // 运动员
        SportsMan sm = new SportsMan("01","李四","男","20","six");
        System.out.print(sm.getName() + " ");
        sm.eat();
    }
}
