package lesson2;
import java.util.Scanner;
public class Activity3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        int soPhanTu = 0;
        //tim so phan tu cua he nhi phan
        for (int soThayThe = number; soThayThe > 0; soPhanTu++){
            soThayThe /= 2;
        }
        int heNhiPhan[] = new int[soPhanTu];
        int thuTuCuaPhanTu = 0;
        //tim gia tri cua cac phan tu
        while (number > 0){
            heNhiPhan[thuTuCuaPhanTu++] = number % 2;
            number /= 2;
        }
        //hien thi he nhi phan
        for (int i = thuTuCuaPhanTu - 1; i >= 0; i--){
            System.out.print(heNhiPhan[i]);
        }
    }
}

