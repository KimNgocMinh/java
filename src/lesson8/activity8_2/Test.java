package lesson8.activity8_2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        //Gán 100.000 phần tử cho 2 list
        for (int i = 0; i < 100000; i++) {
            arrayList.add(1);
            linkedList.add(1);
        }
        //Xác định thời gian chạy của vòng lặp đối với ArrayList khi lấy phần tử thứ 50.000
        long starTime = System.currentTimeMillis();//Xác định thời gian bắt đầu chạy vòng lặp
        for (int i = 0; i < 10000; i++) {
            arrayList.get(arrayList.size()/2);
        }
        long endTime = System.currentTimeMillis();//Xác định thời gian kết thúc vòng lặp
        long result = endTime - starTime;//Xác định thời gian chạy của vòng lặp
        System.out.println(result);//in ra thời gian chạy của vòng lặp

        //Xác định thời gian chạy của vòng lặp đối với LinkedList khi lấy phần tử thứ 50.000
        long starTime1 = System.currentTimeMillis();//Xác định thời gian bắt đầu chạy vòng lặp
        for (int i = 0; i < 10000; i++) {
            linkedList.get(linkedList.size()/2);
        }
        long endTime1 = System.currentTimeMillis();//Xác định thời gian kết thúc vòng lặp
        long result1 = endTime1 - starTime1;//Xác định thời gian chạy của vòng lặp
        System.out.println(result1);//in ra thời gian chạy của vòng lặp

        System.out.println("-------------");

        ////Xác định thời gian chạy của vòng lặp đối với ArrayList khi xoá phần tử thứ 50.000
        long starTime2 = System.currentTimeMillis();//Xác định thời gian bắt đầu chạy vòng lặp
        for (int i = 0; i < 10000; i++) {
            arrayList.remove(arrayList.size()/2);
        }
        long endTime2 = System.currentTimeMillis();//Xác định thời gian kết thúc vòng lặp
        long result2 = endTime2 - starTime2;//Xác định thời gian chạy của vòng lặp
        System.out.println(result2);//in ra thời gian chạy của vòng lặp

        //Xác định thời gian chạy của vòng lặp đối với LinkedList khi lấy phần tử thứ 50.000
        long starTime3 = System.currentTimeMillis();//Xác định thời gian bắt đầu chạy vòng lặp
        for (int i = 0; i < 10000; i++) {
            linkedList.remove(linkedList.size()/2);
        }
        long endTime3 = System.currentTimeMillis();//Xác định thời gian kết thúc vòng lặp
        long result3 = endTime3 - starTime3;//Xác định thời gian chạy của vòng lặp
        System.out.println(result3);//in ra thời gian chạy của vòng lặp
    }


}
