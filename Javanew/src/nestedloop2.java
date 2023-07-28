//        *
//        **
//        ***
//        ****
//        *****

public class nestedloop2 {
    public static void main(String[] args) {
        int n=5;
        int i,j;
        for (i=1;i<=n;i=i+1){
            for(j=1;j<=i;j=j+1){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}