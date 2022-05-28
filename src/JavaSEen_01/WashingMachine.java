package JavaSEen_01;
//洗衣机类代码：
public class WashingMachine extends Appliance{
    // 洗衣机 属性：电机类型、洗涤容量
    private String motorType;
    private String washingCapacity;
    // 展示信息
    public void showInfo(){
        System.out.println("洗衣机的属性如下：");
        System.out.println("品牌: " + super.getBrand() + " 型号: " + super.getModel() + " 颜色: " + super.getColor()
                + " 售价: " + super.getPrice() + " 电机类型: " + this.motorType + " 洗涤容量: " + this.washingCapacity);
    }

    public WashingMachine(String brand, String model, String color, String price, String motorType, String washingCapacity) {
        super(brand, model, color, price);
        this.motorType = motorType;
        this.washingCapacity = washingCapacity;
    }

    public WashingMachine(String brand, String model, String color, String price) {
        super(brand, model, color, price);


    }

    public String getMotorType() {
        return motorType;
    }

    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }

    public String getWashingCapacity() {
        return washingCapacity;
    }

    public void setWashingCapacity(String washingCapacity) {
        this.washingCapacity = washingCapacity;
    }

}
