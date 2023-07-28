import java.util.Scanner;

public class rev {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a = in.nextInt();
        int b=a;
        int rev=0;
        while (a>0){
             rev=rev*10+a%10;
            a=a/10;
        }
        if(rev==b){
            System.out.println("yes Palidrome");
        }
        else{
            System.out.println("nikal ");
        }
    }
}
