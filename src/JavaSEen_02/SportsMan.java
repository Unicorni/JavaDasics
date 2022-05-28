package JavaSEen_02;

public class SportsMan extends people{
    private String grade;
    // 无参构造
    public SportsMan() {
    }
    // 有参构造
    public SportsMan(String id, String name, String sex, String age,String grade) {
        super(id, name, sex, age);
        this.grade = grade;
    }
    // 吃饭方法
    @Override
    public void eat() {
        System.out.println("吃营养餐");
    }
}
