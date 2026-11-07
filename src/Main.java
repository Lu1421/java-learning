import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main (String[] args){
      Random r=new Random();
      Scanner cr=new Scanner(System.in);
      int num=r.nextInt(100)+1;//
      int total=0;
      while(total<7){
          System.out.println("请输入一个1到100间的数字");
          int num1=cr.nextInt();
          if(num1>num){
              System.out.println("猜大了");
              total=total+1;
              //删去continue
          }
          else if(num1<num){
              System.out.println("猜小了");
              total=total+1;
          }
          else {
              System.out.println("猜对了");
              total=total+1;//
              break;
          }
      }
      if(total==7){
            System.out.println("机会用完");
        }
      System.out.println("最终结果为"+num);//
    }
}