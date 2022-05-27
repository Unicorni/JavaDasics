package JavaSEen_01;
//电视类代码：
public class Television extends Appliance {
    // 电视机属性：屏幕尺寸、分辨率
    private String screenSize;
    private String resolvingPower;
    // 展示信息
    public void showInfo(){
        System.out.println("电视的属性如下：");
        System.out.println("品牌: " + super.getBrand() + " 型号: " + super.getModel() + " 颜色: " + super.getColor()
                + " 售价: " + super.getPrice() + " 屏幕尺寸: " + this.screenSize + " 分辨率: " + this.resolvingPower);
    }
    // 无参构造
    public Television() {
    }
    // 全参构造
    public Television(String brand, String model, String color, String price, String screenSize, String resolvingPower) {
        super(brand, model, color, price);
        this.screenSize = screenSize;
        this.resolvingPower = resolvingPower;
    }
    public String getScreenSize() {
        return screenSize;
    }
    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }
    public String getResolvingPower() {
        return resolvingPower;
    }
    public void setResolvingPower(String resolvingPower) {
        this.resolvingPower = resolvingPower;
    }
}