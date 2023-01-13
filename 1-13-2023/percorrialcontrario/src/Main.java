import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void invertiarr (int[] arr) {
        int [] temp = new int[10];
        System.out.println("stampo percorrendo al contrario");
        for(int i= arr.length-1 ;i>=0; i--){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("inserire 10 numeri da mettere nell' array");
        int [] arr = new int[10];
        for (int i = 0; i< arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        invertiarr(arr);
    }
}