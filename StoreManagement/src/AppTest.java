import java.util.Random;

/**
 * Created by Mina Mimi on 2/18/2021.
 */
public class AppTest {

    //psvm + tab:
    public static void main(String[] args) {
        Random random = new Random();

        //10 stores
        Store[] stores = new Store[10];
        for (int i = 0; i < 10; i++) {
            //SmartPhone smartPhone = new SmartPhone("brand_1",true,false,true,"Android",5,"Red",100,5);
            SmartPhone[] smartPhones = new SmartPhone[5];
            for (int j = 0; j < 5; j++) {
                smartPhones[j] = new SmartPhone("Brand_" + random.nextInt(), random.nextBoolean(), random.nextBoolean(), random.nextBoolean(),
                        "OS_" + random.nextInt(10), random.nextLong(), "RED", random.nextLong(), random.nextInt());
            }
            stores[i] = new Store("Store_" + i, "Address_" + i, smartPhones);
            System.out.println(stores[i].toString());
        }

        // In cửa hàng bán được nhiều điện thoại nhất.
        StoreManagement storeManagement = new StoreManagement(stores);
        System.out.println("Max sold store:" + storeManagement.getMaxSoldStore().toString());

        System.out.println("Max revenue store:" + storeManagement.getMaxRevenueStore().toString());

        //In ra số lượng tất cả điện thoại của tất cả các cửa hàng mà có Bluetooth/5G/Wifi.
        System.out.println("Total BT/5G/Wifi:" + storeManagement.countBT5GWifi());

    }
}
