import java.util.*;
public class Perfectsquare {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int sqrt=(int)Math.sqrt(num);
    if(sqrt*sqrt==num){
        System.out.print("perfect square");
    }
    else{
        System.out.print("not a perfect square");
    }
}
}