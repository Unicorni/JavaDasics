package JavaSEen_03;

public class JavaTeacher extends Staff{  //extends 也可是腾是   就是继承   implements  in否门市   就是接口
    // 无参构造
    public JavaTeacher() {
    }
    // 全参构造
    public JavaTeacher(String name, String sex, int age) {
        super(name, sex, age);
    }
    // 工作方法
    @Override
    public void work() {
        System.out.println("java 讲师正在授课\n");
    }

}
