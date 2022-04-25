package lesson4;
import java.util.Scanner;
public class Activity4_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Nhập chiều dài và phần tử của mảng 1
        System.out.print("Enter the length of the first array: ");
        int length1 = input.nextInt();
        int[] arr1 = new int[length1];
        System.out.println("Enter the elements of the first array: " );
        for (int i = 0; i < arr1.length; i ++){
            System.out.printf("arr1[%d]: ", i);
            arr1[i] = input.nextInt();
        }
        // Nhập chiều dài và phần tử của mảng 2
        System.out.print("Enter the length of the second array: ");
        int length2 = input.nextInt();
        int[] arr2 = new int[length2];
        System.out.println("Enter the elements of the second array: " );
        for (int i = 0; i < arr2.length; i ++){
            System.out.printf("arr2[%d]: ", i);
            arr2[i] = input.nextInt();
        }
        // Nối 2 mảng lại với nhau
        int[] arr = new int[length1 + length2];
        for (int i = 0; i < arr.length; i++){
            if (i < arr1.length){
                arr[i] = arr1[i];
            }
            else {
                arr[i] = arr2[i - arr1.length];
            }
        }
        // Sắp xếp mảng tăng dần
        int c = 0; // biến để thay thế
        for (int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if (arr[i] > arr[j]){
                    c = arr[j];
                    arr[j] = arr[i];
                    arr[i] = c;
                }
            }
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
