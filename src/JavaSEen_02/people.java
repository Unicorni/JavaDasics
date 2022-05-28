package JavaSEen_02;
//Java抽象类
/*描述
运用 Java 抽象类，提取 对象 中的共性部分。

题目
我们计划为一所体育学校设计一套系统，需要记录以下人员的信息：

教练员：

​ 属性：员工编号、姓名、性别、年龄

​ 行为：吃饭(吃工作餐)

运动员：

​ 属性：学员编号、姓名、性别、年龄、所在班级

​ 行为：吃饭(吃营养餐)
*
* */
public abstract class people {   //abstract  阿朵是拽
    // 人员属性
    private String id;  //private 怕如委托
    private String name;
    private String sex;
    private String age;
    // 吃饭方法
    public abstract void eat();
    // 无参构造
    public people() {
    }
    // 全参构造
    public people(String id, String name, String sex, String age) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
