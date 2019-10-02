package Level_1;

import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        int i = 0, j = 0;
        Scanner sn = new Scanner(System.in);

        System.out.println("Introduce String Value:");
        int height = Integer.parseInt(sn.nextLine());
// inverse triangle
        while (i < height){
            while (j < height-i){
                System.out.print("#");
                j++;
            }
            System.out.print("\n");
            i++;
            j=0;
        }
// ablsolute triangle
        i = 0;
        j = 0;
        while (i < height){
            while (j <= i){
                System.out.print("#");
                j++;
            }
            System.out.print("\n");
            i++;
            j=0;
        }

    }
}
