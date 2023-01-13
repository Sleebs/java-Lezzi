import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("inserire una sequenza di interi");
        System.out.println("l' imput terminera' all' immissione di 0");
        System.out.println("in caso di immissione di un numero positivo seguito da uno negativo verra' stampato: OK");
        boolean flag = false;
        int num = 0;
        while(true) {
            num = scan.nextInt();
            if (num == 0) break;
            if (num > 0 ) {
                flag =true;
                System.out.println("NO");
                continue;
            }
            if(flag == true) {
                System.out.println("OK");
                flag= false;
                continue;
            }
            System.out.println("NO");
        }

    }
}