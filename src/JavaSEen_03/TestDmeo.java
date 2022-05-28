package JavaSEen_03;
//运用 Java 抽象类，使用 模板模式 的思想设计 类。
public class TestDmeo {
    public static void main(String[] args) {
        System.out.println("\n");
        // Java 讲师
        JavaTeacher jt = new JavaTeacher("王老师","男",28);
        jt.showInfo();
        jt.work();
        // UI 讲师
        UITeacher ut = new UITeacher("张三","男",20);
        ut.showInfo();  //showinfo（）是调用方法后显示的结果
        ut.work();
        ut.draw();
    }
}
