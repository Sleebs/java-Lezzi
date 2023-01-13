import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void isIn(String txt, String word) {
        int risultato = txt.indexOf(word);
      if( risultato != -1)
          System.out.println("non contenuta");
      else
          System.out.println("contenuta");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("che testo?");
        String  text = scan.nextLine();
        System.out.println("che parola?");
        String word = scan.nextLine();
        isIn(text, word);
    }
}