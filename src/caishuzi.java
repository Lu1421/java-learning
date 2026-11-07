import java.util.Scanner;
import java.util.Random;

public class caishuzi {
    public static void main(String[] args){
        Random r=new Random();
        Scanner cr=new Scanner(System.in);
        int num=r.nextInt(100)+1;
        for(int guessCount=1;guessCount<=7;guessCount++){
            System.out.println("请输入1-100间数字");
            int guessNumber=cr.nextInt();
            System.out.println("已猜了"+guessCount+"次");
            if(guessNumber<num){
                System.out.println("猜小了");
            }
            else if(guessNumber>num){
                System.out.println("猜大了");
            }
            else{
                System.out.println("猜对了");
                break;
            }
        }
        System.out.println("正确答案是"+num);
    }
}
