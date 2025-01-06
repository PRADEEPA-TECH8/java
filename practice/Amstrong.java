import java.util.*;
public class Amstrong {
    public static void main(String[] args){
        int n=153;
        int rem=0;
        int original=n;
        int rev=0;
        while(n>0){
            rem=n%10;
            rev+=Math.pow(rem,3);
            n/=10;
        }
        if (rev== original){
            System.out.print("Arm");
        }
        else{
            System.out.print("not a Arm");
        }
    } 
}
