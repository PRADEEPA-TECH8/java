import java.util.*;
public class Magicnumber{
    public static void main(String[] args){
         int mn=50;
         System.out.println("enter the guessnum:");
         int guessnum = -1;
         while (guessnum != mn){
            Scanner sc=new Scanner(System.in);
             guessnum=sc.nextInt();
            if(guessnum<mn)
            System.out.println("low");
            else if (guessnum>mn)
            System.out.println("high");
            else
            System.out.println("congrats");
         }
    }
}
