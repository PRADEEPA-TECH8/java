import java.util.*;
public class Oddeven{
    public static void main(String[] args){
        // Scanner sc=new Scanner(System.in); 
        int even=0;
        int odd=0;
        int i=1;
        do{
            if(i%2==0){
                even+=i;
            }
            else{
                odd+=i;
            }
        i++;
        }while(i<=50);
        System.out.println("even sum:"+even);
        System.out.println("odd sum:"+odd);
    }
}

    
        