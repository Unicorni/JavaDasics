package JavaSEen_01;

import java.security.PublicKey;

//Java继承
/*
* 我们计划为一个电器销售公司制作一套系统，公司的主要业务是销售一些家用电器，例如：电冰箱、洗衣机、电视机产品。
题目解决思路
冰箱类属性：品牌、型号、颜色、售价、门款式、制冷方式。
洗衣机类属性：品牌、型号、颜色、售价、电机类型、洗涤容量。
电视类属性：品牌、型号、颜色、售价、屏幕尺寸、分辨率。
* */
//电器类代码：
public class Appliance {
    // 电器类的属性：品牌、型号、颜色、售价
    private String brand;  //CTRL+D
    private String model;
    private String color;
    private String price;
    public Appliance(){
    }
    public Appliance(String brand, String model, String color, String price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
