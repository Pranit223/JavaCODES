import java.util.Arrays;

public class ee {
    public static void main(String[] args) {

    }

    static int answer(int[] arr) {
        int i, j;
        int temp = 0;
        for (i = 0; i < arr.length - 1; i = i + 1) {
            for (j = i + 1; j > 0; j = j - 1) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;

                } else {
                    break;
                }
            }
        }

  return -1;
    }


}