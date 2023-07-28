//occurence of no. how many times
import java.util.Scanner;
public class occurence {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int b=a.nextInt();
        int to=a.nextInt();
        int count=0;
        while(b>0){
            int c =(int)(b%10);

            if(c==to){
                count++;
            }
            b=b/10;
        }
        System.out.println(count);
    }
}