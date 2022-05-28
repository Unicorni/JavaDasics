package JavaSEen_02;

public class Coach extends people{
    // 无参构造
    public Coach() {
    }
    // 有参构造
    public Coach(String id, String name, String sex, String age) {
        super(id, name, sex, age);
    }
    // 吃饭方法
    @Override
    public void eat() {
        System.out.println("吃营养餐");
    }
}
