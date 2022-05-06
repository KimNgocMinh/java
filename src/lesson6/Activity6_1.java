package lesson6;
import java.util.Scanner;
public class Activity6_1 {
    public static void main(String[] args) {
        Smartphone nokia7 = new Smartphone("Nokia7", false, true, true, "Symbian", 16, "Black", 500, 1);
        Smartphone samsungA5 = new Smartphone("SamsungA5", true, true, true, "Android", 32, "White", 2000, 3);
        Smartphone iPhone11 = new Smartphone("Iphone11",false,false,false,"iOS",128,"Pink",5000,1);
        Smartphone nokia5 = new Smartphone("Nokia5", true, true, false, "Symbian", 8, "Silvir", 150, 2);
        Smartphone samsungB5 = new Smartphone("SamsungB5",true,false,true,"Android",16,"Grey",5000,0);
        Store theGioiDiDong = new Store("TheGioiDiDong","1 Tran Thi Co",2);
        Store cellPhoneS = new Store("Cell Phone S","2 Tran Thi Co",3);
        theGioiDiDong.addphones(nokia7);
        theGioiDiDong.addphones(samsungA5);
        cellPhoneS.addphones(nokia5);
        cellPhoneS.addphones(samsungB5);
        cellPhoneS.addphones(iPhone11);
        StoreManagement quanly = new StoreManagement(2);
        quanly.addStore(theGioiDiDong);
        quanly.addStore(cellPhoneS);
        System.out.print(quanly.toString());
        quanly.highestSold();
        quanly.lowestSold();
        quanly.highestRevenue();
        quanly.lowestRevenue();
        quanly.printPhoneWithBluetooth();
        quanly.printPhoneWith5G();
        quanly.printPhoneWithWifi();
    }
}



