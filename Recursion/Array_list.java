import java.util.ArrayList;

public class Array_list {
    public static void main(String[] args) {
    int []arr={2,3,4,4,4,4};
    int target=4;
    ArrayList<Integer>list=new ArrayList<>();
        System.out.println(findall(arr,target,0,list));
    }
    static ArrayList<Integer> findall(int arr[], int target,int index,ArrayList<Integer>list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return findall(arr,target,index+1,list);
    }
}
