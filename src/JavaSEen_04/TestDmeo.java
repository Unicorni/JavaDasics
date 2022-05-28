package JavaSEen_04;
//测试类代码：
public class TestDmeo {
    public static void main(String[] args){
        // Java 讲师
        JavaTeacher jt = new JavaTeacher("王老师","男",28);
        jt.showInfo();
        jt.work();
        // UI 讲师
        UITeacher ut = new UITeacher("张三","男",20);
        ut.showInfo();
        ut.work();
        ut.draw();
    }
}
