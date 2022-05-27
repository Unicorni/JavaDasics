package JavaSEen_01;
//冰箱类代码：
public class Refrigerator extends Appliance{   //extends 继承
    // 冰箱的属性：门款式、制冷方式
    private String doorStyle;
    private String refrigeration;
    // 展示信息
    public void showInfo(){
        System.out.println("冰箱的属性如下:");
        System.out.println("品牌:"+super.getBrand() + " 型号: " + super.getModel() + " 颜色: " + super.getColor()
                + " 售价: " + super.getPrice() + " 门款式: " + this.doorStyle + " 制冷方式: " + this.refrigeration);
    }
    // 无参构造
    public Refrigerator(String brand, String model, String color, String price) {
        super(brand, model, color, price);
    }
    // 全参构造
    public Refrigerator(String brand, String model, String color, String price, String doorStyle, String refrigeration) {
        super(brand, model, color, price);
        this.doorStyle = doorStyle;
        this.refrigeration = refrigeration;
    }

    public String getDoorStyle() {
        return doorStyle;
    }

    public void setDoorStyle(String doorStyle) {
        this.doorStyle = doorStyle;
    }

    public String getRefrigeration() {
        return refrigeration;
    }

    public void setRefrigeration(String refrigeration) {
        this.refrigeration = refrigeration;
    }
}
