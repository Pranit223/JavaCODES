public class numOFevenDIGITelement {
    public static void main(String[] args) {
    int nums[]={437,313,322,431,686,2643,442};
    int i;

    int total=0;
    for(i=0;i<nums.length;i=i+1){
        int count=0;
        while(nums[i]>0){
             nums[i]=nums[i]/10;
            count =count+1;
        }
        if(count%2==0){
            total=total+1;
        }
        else{
            total=total;
        }
    }
        System.out.println(total);
    }
    }











