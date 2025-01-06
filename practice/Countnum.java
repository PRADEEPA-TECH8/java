import java.util.Scanner;

public class Countnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int count=0;
        while(num>0){
            num/=10;
            count++;
        }
        System.out.print(count);
    }
    
}
