import java.util.*;
public class Greatestprimefactor{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int maxprime=0;
    int i;
    while(num%2==0){
      maxprime=2;
      num/=2;
    }
    for(i=3;i<=Math.sqrt(num);i+=2);{
      while(num%i==0){
        maxprime=i;
        num/=i;
        System.out.println(maxprime);
      }
    }
    if(num > 2){
      maxprime=num;
      System.out.println(maxprime);
    }
  }
}
    

