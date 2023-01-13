import java.util.Scanner;

public class Main {
    public static int sommaArr( int [] arr) {
        int temp = 0;
        for( int num: arr){
            if(!(num<0 && num%2 == 0) || !(num > 0 && num% 3 ==0)) break;
            temp +=num;
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("specificare dimensioni array: ");
        int [] arr = new int[scan.nextInt()];

        System.out.println("inserire un array di interi");
        System.out.println("ogni intero inserito deve soddisfare almeno una delle seguenti condizioni:");
        System.out.println("negativo e divisibile per 2");
        System.out.println("positivo e divisibile per 3");

        for(int i = 0 ; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(sommaArr(arr));
    }
}