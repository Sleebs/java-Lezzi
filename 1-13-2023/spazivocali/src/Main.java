import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int spaziVocali(String txt) {
        int instances = 0;
        char [] arr = txt.toCharArray();
        for(int i = 0 ; i < arr.length; i++) {
            if(arr[i] != ' ') continue;
            if ("aeiou".indexOf(arr[i] )>= 0)
                instances++;
        }
        return instances;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("che stringa?");
        String  text = scan.nextLine();
        System.out.println(spaziVocali(text));
    }
}