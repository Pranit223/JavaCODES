public class try_ {
    public static void main(String[] args) {
        try_("",4);
    }
    static void try_(String p,int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        int i;
        for(i=1;i<=target;i++){
            try_(p+i,target-i);
        }
    }



}
