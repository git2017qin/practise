import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        findAverge(in.nextInt());
    }
    public static void findAverge(int num){
        if(num <= 2){
            System.out.println("输入的值小于2，没有意义");
            return;
        }
        if(num == 3){
            System.out.println("2/1");
            return;
        }

        int sum = 0;
        for(int n = 2; n < num; n++){
            int temp = num;
            int count = 0;
            while(temp!=0){
                sum += (temp%n);
                temp /= n;
                count++;
            }
        }
        int maxSameNum = getMaxSameNum(sum,num-2);
        System.out.println(sum/maxSameNum + "/" + (num-2)/maxSameNum);
    }
    public static int getMaxSameNum(int a,int b){
        int c =a%b;
        if(a<b){
            int temp = a;
            a = b;
            b = temp;
        }
        while(c!= 0){
            a=b;
            b=c;
            c = a%b;
        }
        return b;

    }
}