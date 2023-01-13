import java.util.Scanner;

public class Main {
    public static boolean cercaElemento(int []arr, int num) {
        boolean isIn = false;
        for(int temp: arr){
            if(temp== num){
                isIn = true;
                break;
            }
        }
        return isIn;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("inserire dimensione dell' array, seguita dai valori che deve contenere");

        int[] arr = new int[scan.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("inserire il numero da cercare");
        int numero = scan.nextInt();
        System.out.println(cercaElemento(arr, numero));
    }

}