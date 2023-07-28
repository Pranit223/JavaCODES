import java.util.ArrayList;
import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
       int []nums={1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
       int k=561;
        System.out.println(value(nums,k));

    }
    static ArrayList<Integer>value(int []nums,int k){
long temp=0;

        for (int i = 0; i <nums.length; i++) {
            temp=(temp*10)+nums[i];
        }
        long number=temp+k;
        ArrayList<Integer> list = new ArrayList<Integer>();
        long store=0;
        long a=number;
        while(number>0){
            store=number%10;
            list.add((int)store);
            number=number/10;
            store=0;
        }
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for (int i = list.size()-1; i >=0 ; i--) {
            int j=0;
            int add= list.get(i);
            answer.add(add);

        }

        return answer;


    }





}





