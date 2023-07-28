
//        *
//        **
//        ***
//        ****
//        *****
//        ****
//        ***
//        **
//        *

public class nestedloop1 {
    public static void main(String[] args) {
      int r,c;
      int i,j;
      for(r=1;r<=5;r=r+1){
          for (c=1;c<=r;c=c+1){
              System.out.print("*");
          }
          System.out.println();
      }
     for (i=4;i>=1;i=i-1){
         for(j=i;j>=1;j=j-1){
             System.out.print("*");
         }
         System.out.println();
     }
    }
}