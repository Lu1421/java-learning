import java.util.Random;
import java.util.Scanner;

public class Booleankongzhi {
    public static void main (String[] args){
        Random r=new Random();
        Scanner cr=new Scanner(System.in);
        int num=r.nextInt(100)+1;
        boolean isWin=false;
        int gessCount=1;
        while(!isWin&&gessCount<=7){
            System.out.println("请输入一个1到100间的数字");
            int num1=cr.nextInt();
            System.out.println("已猜了"+gessCount+"次");
            gessCount++;
            if(num1>num){
                System.out.println("猜大了");
            }
            else if(num1<num){
                System.out.println("猜小了");
            }
            else {
                System.out.println("猜对了");
                isWin=true;
            }
        }
        System.out.println("最终结果为"+num);
    }
}


