import java.util.Arrays;

public class Rotated_array {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int x = arr.length;
        int i, j;
        int store;
        for (j = 0; j < 2; j = j + 1) {
            store=arr[arr.length-1];
            for (i = arr.length-2 ; i >= 0; i = i - 1) {
                if (i == 0) {
                    int y=arr[i];
                    arr[i+1]=y;
                    arr[i] = store;
                } else {
                    arr[i + 1] = arr[i];
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}