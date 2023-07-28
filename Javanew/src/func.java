import java.util.Scanner;
public class func {
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
        System.out.print("enter1:");
         int a=input.nextInt();
        System.out.print("enter2");
        int b =input.nextInt();
        int ans=sum(a, b);
        System.out.println(ans);
    }
    static int sum(int a,int b){
        int c=a+b;
        return c;
    }
}
