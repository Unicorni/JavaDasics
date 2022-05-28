package JavaSEen_04;
//Java接口
//运用 Java 接口，在接口中声明 方法，对象实现接口中 抽象方法。
//题目
//        我们计划为一所 IT 学院设计一套系统，请设计 类 及接口 。
//
//        员工类：
//
//         属性：姓名、性别、年龄
//
//         行为：工作(抽象)、展示信息
//
//        Java 讲师类：
//
//         属性：姓名、性别、年龄
//
//         行为：展示信息、Java 授课
//
//        UI 讲师类：
//
//         属性：姓名、性别、年龄
//
//         行为：展示信息、UI 授课、绘画
//
//        绘画接口：
//
//         抽象方法：绘画

//抽象类代码：
public abstract class Staff {
    // 属性
    private String name; //ctrl+d
    private String sex;
    private int age;
    // 工作方法
    public abstract void work();
    // 无参构造
    public Staff() {
    }
    // 有参构造
    public Staff(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    // 定义显示信息方法
    public void showInfo(){
        System.out.println("员工信息：");
        System.out.println("姓名：" + name + " 性别：" + sex + " 年龄：" + age);
    }
}
