package JavaSEen_02.day02;

public class Manager extends Notice{
    // 无参构造
    public Manager() {
    }
    // 全参构造
    public Manager(String id, String name, int age) {
        super(id, name, age);
    }
    // 发通知方法
    @Override
    public void send() {
        System.out.println("    经理通知");
    }

}
