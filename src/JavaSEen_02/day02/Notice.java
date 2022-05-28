package JavaSEen_02.day02;
//Java模板模式
/*
* 某公司的系统中需要记录两类员工：

员工类：

​ 属性：工号、姓名、年龄

​ 行为：发布通知

经理类：

​ 属性：工号、姓名、年龄、年终奖额

​ 行为：发布通知

任何员工发布 “通知” 都统一使用以下格式：

通知：

​ xxxxxxxxx

​ xxxxxxxxx

​ 极客云科技有限公司
* */
public abstract class Notice {
    //属性
    private String id;
    private String name;
    private int age;
    // 无参构造
    public Notice() {
    }
    // 全参构造
    public Notice(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    // 展示信息
    public void showInfo(){
        System.out.println("人员信息:");
        System.out.println("编号:" + id + "名字:" + name + "年龄:" + age);
    }
    // 发部通知
    public void notice(){
        System.out.println("通知:");
        send(); //send 申特
        System.out.println("           极客云科技有限公司\n");

    }
    public abstract void send();
}
