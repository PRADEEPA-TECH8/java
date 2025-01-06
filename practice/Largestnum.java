import java.util.*;
public class Largestnum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int max=0;
        while(num > 0){
            sum=num%10;
        if (sum>=max){
         max=sum; 
        }
        num/=10;     
        } 
        System.out.println("the maximum value is"+max);
    }
}
   
    
    
    

