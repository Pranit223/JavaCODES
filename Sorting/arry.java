import java.lang.reflect.Array;
import java.util.Arrays;

public class arry {
    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 0, 0},
                {1, 0, 0, 1},
                {0, 1, 1, 1},
                {1, 0, 1, 0}
        };
        int i, j;
        int r, c;
        int[][] arr = rev(image);
        for(i=0;i<arr.length;i=i+1){
            System.out.println(Arrays.toString(arr[i]));
        int[][]prr=bass(arr);


        }


    }
        static int[][] rev ( int[][] image){
            int i, j, k;

            for (i = 0; i < image.length; i = i + 1) {
                int last = image.length - 1;
                int[][] nums = new int[image.length][image.length];

                j = 0;
                while (j <= last) {
                    nums[i][j] = image[i][j];
                    image[i][j] = image[i][last];
                    image[i][last] = nums[i][j];
                    j = j + 1;
                    last = last - 1;

                }

            }
            return image;

        }
        static int[][] bass(int [][]image) {
        int r,c;
            for (r = 0; r < image.length; r = r + 1) {
                for (c = 0; c < image[r].length; c = c + 1) {
                    if (image[r][c] == 0) {
                        image[r][c] = 1;
                    } else {
                        image[r][c] = 0;
                    }
                }
            }
            return image;
        }
    }

