package Level_1;

import java.util.Scanner;
import java.lang.String;

class Problem_1 {
    public static void main(String[] args) {

        int i = 0, o;
        Scanner sn = new Scanner(System.in);
        boolean isPolindrome = true;

        System.out.println("Introduce String Value:");
        String polindrome = sn.nextLine();

        polindrome = polindrome.replaceAll(" ", "");
        o = polindrome.length() - 1;

        while (i < polindrome.length() / 2) {
            if (polindrome.charAt(i) == polindrome.charAt(o)){
                i++;
                o--;
            } else {
                isPolindrome = false;
                break;
            }
        }

        if (isPolindrome) {
            System.out.println("String is polindrome, zatzeneste");
        } else {
            System.out.println("A, a, a, String is not a polindrome, mai incearca");
        }
    }
}