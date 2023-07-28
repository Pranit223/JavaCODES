
//        *****
//        ****
//        ***
//        **
//        *
//
public class nestedloop5 {
    public static void main(String[] args) {
        int i,j;
        int n=5;
        for(i=0;i<=n;i=i+1){
            for(j=1;j<=n-i;j=j+1){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
