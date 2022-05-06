package lesson6;

public class StoreManagement {
    private int numberOfStore;
    private Store[] stores;
    private int index;

    public StoreManagement(int numberOfStore) {
        this.numberOfStore = numberOfStore;
        stores = new Store[numberOfStore];
    }

    public void addStore(Store store){
        if (index == stores.length) System.out.print("Qua met moi");
        else {
            stores[index] = store;
            index++;
        }
    }

    public int getNumberOfStore() {
        return numberOfStore;
    }

    public void setNumberOfStore(int numberOfStore) {
        this.numberOfStore = numberOfStore;
    }

    public Store[] getStores() {
        return stores;
    }

    public void setStores(Store[] stores) {
        this.stores = stores;
    }

    public int totalBluetooth_AllStore(){
        int result = 0;
        for (int i = 0; i < stores.length; i++) {
            result = stores[i].totalBluetooth();
        }
        return result;
    }
    public int total5G_AllStore(){
        int result = 0;
        for (int i = 0; i < stores.length; i++) {
            result = stores[i].total5G();
        }
        return result;
    }
    public int totalWifi_AllStore(){
        int result = 0;
        for (int i = 0; i < stores.length; i++) {
            result = stores[i].totalWifi();
        }
        return result;
    }

    public String toString(){
        String s = "";
        for (Store store : stores) {
            s += store.getInformation();
            s += "\r\n";
        }
        return s;
    }

    public void highestSold() {
        Store highest = stores[0];
        for (int i = 1; i < stores.length; i++){
            if (highest.totalNumberOfPhoneSold() < stores[i].totalNumberOfPhoneSold())
                highest = stores[i];
        }
        System.out.println("Highest selling store: " +highest.getName());
    }

    public void lowestSold() {
        Store lowest = stores[0];
        for (int i = 1; i < stores.length; i++) {
            if (lowest.totalNumberOfPhoneSold() > stores[i].totalNumberOfPhoneSold())
                lowest = stores[1];
        }
        System.out.println("Lowest selling store: " + lowest.getName());
    }

    public void highestRevenue() {
        Store highest = stores[0];
        for (int i = 1; i < stores.length; i++) {
            if (highest.totalRevenue() < stores[i].totalRevenue())
                highest = stores[i];
        }
        System.out.println("The store with highest revenue: " + highest.getName());
    }

    public void lowestRevenue() {
        Store lowest = stores[0];
        for (int i = 1; i < stores.length; i++) {
            if (lowest.totalRevenue() > stores[i].totalRevenue())
                lowest = stores[i];
        }
        System.out.println("The store with lowest revenue: " + lowest.getName());
    }

    public void printPhoneWithBluetooth() {
        for (int i = 0; i < stores.length; i++) {
            System.out.println(stores[i].getName() +  " : total Phones with bluetooth: " + stores[i].totalBluetooth());
        }
    }

    public void printPhoneWith5G() {
        for (int i = 0; i < stores.length; i++) {
            System.out.println(stores[i].getName() + " : total Phones with 5G: " + stores[i].total5G());
        }
    }

    public void printPhoneWithWifi() {
        for (int i = 0; i < stores.length; i++) {
            System.out.println(stores[i].getName() + " : total Phone with wifi: " + stores[i].totalWifi());
        }
    }
}
