package Level_1;

import java.util.Scanner;
import static java.lang.System.*;

public class Problem_4 {
    public static void main(String[] args) {
        int length, aux, o = 0;
        Scanner scn = new Scanner(in);

        out.print("Introduce array length: ");
        length = Integer.parseInt(scn.nextLine());

        int[] arr = new int[length];

        out.print("\nIan pune array-u :");
        while (o < length) {
            arr[o] = Integer.parseInt(scn.nextLine());
            o++;
        }
        o = 0;
        out.print("\nArrayu sortat este: ");
        for (int i = 0; i < length; i++) {
            for (int j = 1; j < (length - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    aux = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = aux;
                }
            }
        }
        while (o < length) {
            out.print(arr[o]);
            o++;
        }
    }
}
