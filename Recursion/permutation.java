public class permutation {
    public static void main(String[] args) {
        String str="abc";
        permutation("",str);
        System.out.println(count);
    }
    static int count=0;
   static void permutation(String p,String up){
        if(up.isEmpty()){
            count=count+1;
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            permutation(f+ch+s,up.substring(1));
        }
   }
}
