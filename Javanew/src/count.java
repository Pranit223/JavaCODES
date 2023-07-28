import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter Full no.");
        int b=in.nextInt();
        System.out.print("enter num to know repetation");
        int a=in.nextInt();
        int count=0;
        while(b>0){
            int ev=b%10;
            if(ev==a){
                count=count+1;
            }
            else{
                count=count;
            }
            b=b/10;

        }
        System.out.println(count);
    }
}
