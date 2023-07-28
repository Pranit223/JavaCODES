import java.util.ArrayList;

public class Array_listanother {
    public static void main(String[] args) {
        int []arr={2,3,4,4,5,6};
        int target=4;
        ArrayList<Integer>list=new ArrayList<>();
        System.out.println(findall(arr,target,0));
    }
    static ArrayList<Integer> findall(int arr[], int target, int index){
        ArrayList<Integer>list=new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer>all=findall(arr,target,index+1);
        list.addAll(all);
        return list;

    }
}
