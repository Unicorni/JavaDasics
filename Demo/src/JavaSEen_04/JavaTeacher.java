package JavaSEen_04;
//Java 讲师代码：
public class JavaTeacher extends Staff{
    // 无参构造
    public JavaTeacher() {}

    // 全参构造
    public JavaTeacher(String name, String sex, int age) {
        super(name, sex, age);
    }

    @Override
    public void work() {
        System.out.println("java 教师正在授课\n");
    }

}
