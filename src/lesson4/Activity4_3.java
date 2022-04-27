package lesson4;
import java.lang.Math;
import java.util.Scanner;
public class Activity4_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap chieu dai cua mang: ");
        int length = input.nextInt();
        int[] array = new int[length];
        System.out.println("Nhap cac phan tu mang: ");
        for (int i = 0; i < length; i++){
            array[i] = input.nextInt();
        }
        //tạo biến đếm và biến chứa độ dài của dãy liền kề lớn nhất;
        int doDai = 0;
        int index = 0;
        for (int i = 0; i < array.length -1; i++) {
            int dem = 1;
           for (int j = i +1; j < array.length; j++){
               if (array[j] == array[j - 1] + 1) dem++;
               else break;
           }
           if (dem > doDai){
               index = i;
               doDai = dem;
           }
        }
        int[] mangMoi = new int[doDai];//tạo 1 mảng mới với chiều dài của dãy liên tiếp liền kề
        for (int i = 0; i < doDai; i++) {//gán phần tử liên tiếp từ mảng củ qua mảng mới
            mangMoi[i] = array[i+ index];
        }
        // in kết quả
        System.out.println("day so lien tiep lien ke lon nhat la: ");
        for (int i = 0; i < doDai; i++){
            System.out.print(mangMoi[i] + " ");
        }
        }
        }

