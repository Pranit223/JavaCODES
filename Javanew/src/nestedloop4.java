//         *
//        **
//       ***
//      ****
//     *****
public class nestedloop4 {
    public static void main(String[] args) {
        int i,j,z;
        int n=5;
        for (i=1;i<=n;i=i+1){
            for (z=1;z<=n-i;z=z+1){
                System.out.print(" ");
            }
            for(j=1;j<=i;j=j+1){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
