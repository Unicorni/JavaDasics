package JavaSEen_03;

public class UITeacher extends Staff implements Draw{   //implements in否门市   就是接口
    // 无参构造
    public UITeacher() {
    }
    // 全参构造
    public UITeacher(String name, String sex, int age) {
        super(name, sex, age);
    }
    // 重写工作方法
    @Override
    public void work() {
        System.out.println("UI 讲师正在授课");
    }
    // 实现绘画方法
    @Override
    public void draw() {
        System.out.println("UI 讲师正在绘画\n");
    }

}
