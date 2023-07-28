import java.util.Arrays;

///



//1.check if j is smaller than j-1
//2.if yes then swap j and (j-1) else continue
//3.every time j run it will run
//        1 less time becaz no need to check sorted number(j<arr.length-i)
//4.Main loop will run as cout i.e how many time have to run checks and it run arr.length times


public class Bubble_sort {
    public static void main(String[] args) {
        int j,i;
        int []arr={5,4,3,2,1,0};
        int temp=0;
        int len=arr.length;
        boolean check;
        for(i=0;i<len;i=i+1){
        check=false;
            for(j=1;j<len-i;j=j+1){
                if(arr[j]<arr[j-1]){

                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    check=true;
                }
                else{
                    continue;
                }
            }
            if(check==false){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
