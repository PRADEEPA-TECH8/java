import java.util.*;
public class Prime{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number: ");
        int n=sc.nextInt();
        for(int i=1;i <= 10;i++)
           System.out.println(i+"*"+n+"="+(n*i));
    } 
}


