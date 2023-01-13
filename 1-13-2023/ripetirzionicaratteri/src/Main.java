import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("quanti caratteri?");
        int  numCar = scan.nextInt();
        scan.nextLine();
        System.out.println("inserire valori");
        for (int i = 0; i< numCar; i++) {
            System.out.println(scan.next());
        }
    }
}