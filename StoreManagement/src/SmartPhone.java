/**
 * Created by Mina Mimi on 2/18/2021.
 */
public class SmartPhone {
    //Encapsulate
    private String brand;
    private boolean hasBlueBooth;//YES/NO
    private boolean has5G;
    private boolean hasWifi;
    private String os;
    private float memory;
    private String color;
    private long price;
    private int totalSold;


    public SmartPhone(String brand, boolean hasBlueBooth, boolean has5G, boolean hasWifi, String os, float memory, String color, long price, int totalSold) {
        this.brand = brand;
        this.hasBlueBooth = hasBlueBooth;
        this.has5G = has5G;
        this.hasWifi = hasWifi;
        this.os = os;
        this.memory = memory;
        this.color = color;
        this.price = price;
        this.totalSold = totalSold;
    }

    //getter:
    public String getBrand() {
        return this.brand;
    }

    //setter:
    public void setBrand(String brand) {
        this.brand = brand;
    }


    //Alt + Insert:


    public boolean isHasBlueBooth() {
        return hasBlueBooth;
    }

    public void setHasBlueBooth(boolean hasBlueBooth) {
        this.hasBlueBooth = hasBlueBooth;
    }

    public boolean isHas5G() {
        return has5G;
    }

    public void setHas5G(boolean has5G) {
        this.has5G = has5G;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public float getMemory() {
        return memory;
    }

    public void setMemory(float memory) {
        this.memory = memory;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getTotalSold() {
        return totalSold;
    }

    public void setTotalSold(int totalSold) {
        this.totalSold = totalSold;
    }
}
