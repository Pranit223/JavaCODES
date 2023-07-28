import java.util.Scanner;

public class armstorng {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        boolean x=arm(a);
        System.out.println(x);
    }
    static boolean arm(int a){
        int b=a;
        int c=a;
        int count=0;

        while(a>0){
            int ref=a%10;
            count=count+1;
            a=a/10;

        }
        int fuk=0;
        while(b>0){
            fuk=(int)(Math.pow((b%10),count)+fuk);
            b=b/10;
        }
        if (fuk==c){
            return true;
        }
        else{
            return false;
        }
    }
}
