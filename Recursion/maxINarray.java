
///FIND MAXIMUM ELEMENT IN AN ARRAY USING RECURSION


public class maxINarray {
    public static void main(String[] args) {
        int []arr={5,2,10,8,9,11};
        int max=arr[0];
        System.out.println(maxin(arr,max,0));
    }
    static int maxin(int []arr,int max,int index){
        if(index==arr.length){
          return max;
        }
        if(arr[index]>max){
            max=arr[index];
        }
        return maxin(arr,max,index+1);
    }
}
