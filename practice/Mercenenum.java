import java.util.*;
public class Mercenenum {
    public static void main (String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the num");
    int n= sc.nextInt();
    int x=(int)Math.pow(2,n)-1;
    int num=1;
    if(x>n){
        System.out.print("mercene number");
    }
    else{
        System.out.print("not a mercene number"); 
    }
    }
}
