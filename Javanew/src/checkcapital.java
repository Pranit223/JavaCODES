import java.util.Scanner;
public class checkcapital {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char a= input.next().charAt(0);
        if(a>='a'&& a<='z'){
            System.out.println("lower Case");

        }else{
            System.out.println("upper Case");
        }


    }

}

