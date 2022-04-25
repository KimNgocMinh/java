package lesson4;
import java.util.Arrays;
import java.util.Scanner;
public class Activity4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Nhập chiều dài và phần tử của mảng
        System.out.print("Enter the length of the array: ");
        int length = input.nextInt();
        int[] array = new int[length];
        System.out.println("Enter the elements of the array: " );
        for (int i = 0; i < array.length; i ++) {
            System.out.printf("arr1[%d]: ", i);
            array[i] = input.nextInt();
        }
        array = loaiPhanTuTrungNhau(array);
        System.out.print(Arrays.toString(array));
    }

    public static int[] loaiPhanTuTrungNhau(int[] array1) {
        int count = 0;
        for (int i = 0; i < array1.length; i++){
            if (array1[i] != -1) count++;
            for (int j = i+1; j < array1.length; j++){
                if (array1[j] == array1[i]) array1[j] = -1;
            }
        }
        int[] ketQua = new int[count];
        int j = 0;
        for (int i = 0; i < array1.length; i++){

            if (array1[i] != -1) {
                ketQua[j] = array1[i];
                j++;
            }
            if (j == count) break;
        }
        return ketQua;
    }
}
