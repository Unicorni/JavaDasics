package JavaSEen_02.day02;

public class Test {
    public static void main(String[] args) {
        System.out.println("极客云...通知公告\n");
        //员工
        Staff sf = new Staff("01","张三",30);
        sf.showInfo();
        sf.notice();
        // 经理
        Manager m = new Manager("02","李经理",35);
        m.showInfo();
        m.notice();
    }
}
