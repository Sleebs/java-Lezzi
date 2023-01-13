import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int [] invertiarr (int[] arr) {
        int [] temp = new int[10];
        for(int i=0,j = 9;i<arr.length; i++, j--){
            temp[j] = arr[i];
        }
        return temp;
    }
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("inserire 10 numeri da mettere nell' array");
        int [] arr = new int[10];
        for (int i = 0; i< arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Arrya invertito");
        System.out.println(Arrays.toString(invertiarr(arr)));
    }
}