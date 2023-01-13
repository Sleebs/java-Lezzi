import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("inserire una sequenza di interi");
        System.out.println("l' intero inserito deve soddisfare almeno una delle seguenti condizioni:");
        System.out.println("negativo e divisibile per 2");
        System.out.println("positivo e divisibile per 3");
        int somma = 0  , counter = 0;

        while(true) {
            int num = scan.nextInt();
            if(!(num<0 && num%2 == 0) || !(num > 0 && num% 3 ==0)) break;
            somma += num;
            counter ++;
        }
        if(counter > 0)
            System.out.println(somma);
        else
            System.out.println("nessun numero valido inserito");
    }
}