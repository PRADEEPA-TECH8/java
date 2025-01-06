import java.util.*;
public class Harshadnum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int original=num;
        int sum=0;
        while(num>0){
            sum+=num%10;   
            num/=10;
        }
        if(original%sum==0){
            System.out.print("harshad num");
        }
        else{
            System.out.print("not a harshad num");
        }
    } 
}
