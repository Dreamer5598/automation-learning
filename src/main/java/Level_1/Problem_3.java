package Level_1;

import java.util.Scanner;
import static java.lang.System.*;

public class Problem_3 {
    public static void main(String[] args) {
        int length, i = 0;
        Scanner snc = new Scanner(System.in);
        out.print("ian pune lungimea la array: ");
        length = Integer.parseInt(snc.nextLine());
        float[] list = new float[length];
        out.print("\nian introdu Array-u: ");
        while (i < length) {
            list[i] = Float.parseFloat(snc.nextLine());
            i++;
        }
        i = 0;
        out.print("\nai introdus Array-u: ");
        while (i < length) {
            out.print(list[i] + " ");
            i++;
        }
        i=0;
        float[] inversedList = invertFloatList(list);
        out.print("\nsi arrayu tau inversat e: ");
        while (i < inversedList.length) {
            out.print(inversedList[i] + " ");
            i++;
        }
    }
//can be used a auxiliar value but in another life

    private static float[] invertFloatList(float[] list) {
        int index = 0;
        float[] invertedList = new float[list.length];
        while (index < list.length) {
            invertedList[list.length - index - 1] = list[index];
            index++;
        }
        return invertedList;
    }
}