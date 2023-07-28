import java.util.Arrays;
import java.util.Scanner;

public class Array2Dinput {
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        int i;
        int j;
        Scanner in = new Scanner(System.in);
        for (i = 0; i < a.length; i = i + 1) {
            for (j = 0; j < a[i].length; j = j + 1) {
                a[i][j] = in.nextInt();
            }
        }
        for (i = 0; i < a.length; i = i + 1) {
                System.out.println(Arrays.toString(a[i]));
            }

        }

    }
