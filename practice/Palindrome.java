import java.util.Scanner;

public class Palindrome {
    
    public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int num=sc.nextInt();
    int sum=0;
    int original=num;
    int rev=0;
    while(num > 0){
        sum=num%10;
        rev=sum+rev*10;
        num/=10;
    }
    if(original==rev){
        System.out.print("palindrome");
    }
    else{
        System.out.print("not a palindrome");
    }

}
}

    

