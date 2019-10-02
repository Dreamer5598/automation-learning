package Level_1;

import java.util.Scanner;
import static java.lang.System.*;

public class Problem_5 {
    public static void main(String[] args) {
        int length, index = 0, odd = 0;
        Scanner scn = new Scanner(in);

        out.print("Introduce array length: ");
        length = Integer.parseInt(scn.nextLine());

        int[] arr = new int[length];

        out.print("\nIan pune array-u :");
        while (index < length) {
            arr[index] = Integer.parseInt(scn.nextLine());

            if (arr[index] % 2 == 0) {
                odd++;
            }
            index++;
        }
        out.print("\nSunt " + odd + " elemente pare, si "+ (length - odd) + " elemente impare");
    }
}
