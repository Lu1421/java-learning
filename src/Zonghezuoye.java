import java.util.Arrays;

public class Zonghezuoye {
    //班级分数处理系统
    //线性查找分数
    public static int searchArr(int[] arr,int key){
       for(int i=0;i<arr.length;i++){
           if(arr[i]==key){
               return i;
           }
        }
       return -1;
    }
    public static int[] copyArr(int[]arr){
        //拷贝分数当备份
        int[] copyArr=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            copyArr[i]=arr[i];
        }
        return copyArr;
    }
    public static void main(String[] args){
        //录入分数
        int[] score={54,60,75,87,90};
        //查找某个分数
        int index=searchArr(score,60);
        System.out.println(index);
        //把分数原地翻转
        int left=0;
        int right=score.length-1;
        while(left<right) {
            int temp = score[left];
            score[left] = score[right];
            score[right] = temp;
            left++;
            right--;
        }
        //拷贝分数当备份
        int[] copyScore=copyArr(score);
        //最后全部打印
        System.out.println(Arrays.toString(score));
        System.out.println(Arrays.toString(copyScore));
    }
}
