/**
 * Created by Mina Mimi on 2/18/2021.
 */
public class StoreManagement {
    private Store[] stores;

    //Alt + Insert:
    public StoreManagement(Store[] stores) {
        this.stores = stores;
    }

    public int countBT5GWifi() {
        int count = 0;
        for (Store store : stores) {
            for (SmartPhone smartPhone : store.getSmartPhones()) {
                if (smartPhone.isHas5G() || smartPhone.isHasBlueBooth() || smartPhone.isHasWifi()) {
                    count++;
                }
            }
        }
        return count;
    }

    // Tìm cửa  hàng bán được nhiều điện thoại nhất.
    public Store getMaxSoldStore() {
        Store result = stores[0];
        for (int i = 0; i < stores.length; i++) {
            if (stores[i].getTotalSold() > result.getTotalSold()) {
                result = stores[i];
            }
        }
        return result;
    }

    //CTRL + ALT + L : formatting code
    public Store getMaxRevenueStore() {
        Store result = stores[0];
        for (int i = 0; i < stores.length; i++) {
            if(stores[i].getTotalRevenue() > result.getTotalRevenue()) {
                result = stores[i];
            }
        }
        return result;
    }
}
