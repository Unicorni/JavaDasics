package JavaSEen_02.day02;

public class Staff extends Notice{
    // 无参构造
    public Staff() {
    }
    // 全参构造
    public Staff(String id, String name, int age) {
        super(id, name, age);
    }
    // 发通知方法
    @Override
    public void send() {
        System.out.println("    员工通知");
    }
}
