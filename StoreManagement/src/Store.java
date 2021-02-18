/**
 * Created by Mina Mimi on 2/18/2021.
 */
public class Store {
    private String name;
    private String address;
    private SmartPhone[] smartPhones;

    public Store(String name, String address, SmartPhone[] smartPhones) {
        this.name = name;
        this.address = address;
        this.smartPhones = smartPhones;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public SmartPhone[] getSmartPhones() {
        return smartPhones;
    }

    public void setSmartPhones(SmartPhone[] smartPhones) {
        this.smartPhones = smartPhones;
    }

    //Tính tổng số lượng điện thoại bán được.
    public int getTotalSold() {
        int count = 0;
        for(SmartPhone smartPhone:smartPhones) {
            count = count + smartPhone.getTotalSold();
        }
        return count;
    }

    //Tính tổng doanh thu
    public long getTotalRevenue() {
        long count = 0;
        for(SmartPhone smartPhone:smartPhones) {
            count = count + smartPhone.getTotalSold()*smartPhone.getPrice();
        }
        return count;
    }

    public void printStoreDetail() {
        System.out.println("name:" + name + "-adress:" + address);
    }

    //Alt + insert:


    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
