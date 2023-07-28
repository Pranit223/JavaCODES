import java.util.ArrayList;

public class problem {
    public static void main(String[] args) {
        int[] nums={1,0,-1,0,-2,2};
        int len= nums.length;
        int target=-0;
        ArrayList<Integer> list=new ArrayList<>();
        int a,b=0,c=0,d=0;
        int i=0,j=0,k=0,l=0;
        while(i<len){
            a=nums[i];
            j=0;
            while (j<len){
                b=nums[j];
                k=0;
                    while (k<len){
                        c=nums[k];
                        l=0;
                            while (l<len){
                                d=nums[l];
                                if (a+b+c+d==target){
                                    System.out.println(a+" "+b+" "+c+" "+d);
                                }
                                l++;


                                }
                            k++;
                            }
                    j++;
                        }
            i++;

                    }

                }

            }






