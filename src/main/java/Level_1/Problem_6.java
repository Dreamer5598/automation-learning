package Level_1;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Problem_6 {
    public static void main(String[] args) {
        int length;
        Scanner scn = new Scanner(in);

        out.print("Introduce n val: ");
        length = Integer.parseInt(scn.nextLine());

        out.print("Pi: " + Math.round(Math.PI * Math.pow(10, length)) / Math.pow(10, length));
    }
}
