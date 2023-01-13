import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void stampaAlterni ( int[] arr) {
        for (int i = 0; i < arr.length;i++) {
            if (i%2 == 0)
                System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("inserire 10 numeri da mettere nell' array");
        int [] arr = new int[10];
        for (int i = 0; i< arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        stampaAlterni(arr);
    }
}