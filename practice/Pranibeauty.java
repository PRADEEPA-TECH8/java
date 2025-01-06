import java.util.*;
public class Pranibeauty{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int max=0;
        int min=0;  
        char choice;
        do{
            System.out.println("Enter the number:");
            int n=sc.nextInt();
            if(min==0){
                min=n;
            }
            if(n>max){
                max=n;
            }
            if(n<min){
                min=n;
            }
            System.out.print("Do you want to continue");
            choice =sc.next().charAt(0);
        }while(choice == 'y'||choice == 'Y');
       System.out.println("the min value is "+min);
       System.out.println("the max value is "+max); 
        }    
    }
