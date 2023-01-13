import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int mediadivisibilipertre ( int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length;i++) {
            if (arr[i] % 3 == 0)
                temp += arr[i];
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("lunghezza array?");
        int [] arr = new int[scan.nextInt()];
        System.out.println("inserire valori");
        for (int i = 0; i< arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("la media e': " + mediadivisibilipertre(arr));
    }
}