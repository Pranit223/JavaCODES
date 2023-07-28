import java.util.Arrays;
import java.util.Scanner;
public class Arrayinput {
    public static void main(String[] args) {
        int[] arr=new int[5];
        int i;
        Scanner in=new Scanner(System.in);
        for (i=0;i<arr.length;i=i+1){
            arr[i]=in.nextInt();

        }
        System.out.print(Arrays.toString(arr));
        }
    }

