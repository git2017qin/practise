import java.util.Scanner;

public class Test2{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int result = findLuckNum(in.nextInt());
        System.out.println(result);
    }
    public static int sum(int num,int n){
        int temp = num;
        int sum = 0;
        while(temp != 0){
            sum += temp%n;
            temp /= n;
        }
        return sum;
    }
    public static int findLuckNum(int num){
        if(num <= 0)
            return -1;
        int count = 0;
        for(int i = 1; i <= num ; i++){
            if(sum(i,2) == sum(i,10)){
                count ++;
            }
        }
        return count;
    }
}