import java.util.Scanner;

public class Main {

    public static int somma(int[] arr) {
        int risultato = 0;
        for(int num: arr) {
            risultato += num;
        }
        return risultato;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("inserire dimensione dell' array, seguita dai valori che deve contenere");

        int [] arr = new int[scan.nextInt()];
        for(int i = 0; i< arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(somma(arr));
    }
}