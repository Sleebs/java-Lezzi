import java.util.Scanner;

public class Main {

    public static int contaRipetuti(int []arr, int num) {
        int instances = 0;

        return instances;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("inserire dimensione dell' array, seguita dai valori che deve contenere");

        int[] arr = new int[scan.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("interire il numero da cercare");
        int num = scan.nextInt();
        System.out.println(contaRipetuti(arr, num) + " instances of " + num);
    }
}