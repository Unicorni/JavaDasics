package JavaSEen_04;

import JavaSEen_03.Draw;
//UI 讲师代码：
public class UITeacher extends Staff implements Draw {
    // 无参构造
    public UITeacher() {
    }
    // 全参构造
    public UITeacher(String name, String sex, int age) {
        super(name, sex, age);
    }
    // 重写工作方法
    @Override
    public void draw() {
        System.out.println("UI 讲师正在授课");
    }
    // 实现绘画方法
    @Override
    public void work() {
        System.out.println("UI 讲师正在绘画\n");
    }
}
