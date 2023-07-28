public class linearsearch {
    public static void main(String[] args) {
        int []arr={1,3,5,4,87};
        int target=87;
        System.out.println(linear(arr,target,0));
    }
    static int linear(int arr[],int target,int index){
        if(arr[index]==target){
            return index;
        }
        if(index==arr.length-1){
            return -1;
        }

        return linear(arr,target,index+1);


    }
}
