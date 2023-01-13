import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static String invertString(String txt) {
        String temp = "";
        char [] cArr = txt.toCharArray();
        for( int  i = cArr.length-1; i>=0; i--) {
            temp += cArr[i];
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("che stringa?");
        String  text = scan.nextLine();
        System.out.println(invertString(text));
    }
}