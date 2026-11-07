public class chengfabiao {
    public static void main(String[] args){
        for(int i=1;i<=9;i++){
            for(int j=1;j<=9;j++){
                if(i>=j){
                    int total=i*j;
                    System.out.print(i+"*"+j+"="+total+"\t");
                }
                else{
                    break;
                }
            }
            System.out.println();
        }
    }
}
