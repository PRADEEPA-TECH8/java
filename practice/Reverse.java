import java.util.Scanner;

public class Reverse {
    
    public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int num=sc.nextInt();
    int sum=0;
    int rev=0;
    while(num > 0){
        sum=num%10;
        num/=10;
        rev=sum+rev*10;
    }
    System.out.print(rev);

}
}

