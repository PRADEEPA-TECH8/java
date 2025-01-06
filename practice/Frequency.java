import java.util.*;
public class Frequency {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         int num=sc.nextInt();
        int n=num;
        int count=0;
        int rem=0;
        for(int i=9;i>=0;i--){
              while(n>0){
                rem=n%10;
                if(i==rem) count++;
                n/=10;
            }
            if(count!=0){
                System.out.println(i+":"+count);
            }
            count=0;
        }
    }
}
