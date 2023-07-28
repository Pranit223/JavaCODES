public class phone_dail {
    public static void main(String[] args) {
    phone_dail("","12");

    }
    static void phone_dail(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit=up.charAt(0)-'0';
        int i;
        for(i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            phone_dail(p+ch,up.substring(1));
        }
    }
}
