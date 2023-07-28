
//       *****
//        ****
//         ***
//          **
//           *
public class nestedloop3 {
    public static void main(String[] args) {
        int n=5;
        int r,c,z;
        for(r=0;r<n;r=r+1){
            for(z=1;z<=r;z=z+1){
                System.out.print(" ");
            }
            for(c=1;c<=n-r;c=c+1){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
