import java.util.Scanner;

public class Matrixx {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int i;
        int j;
        int c=1;
        for(i=1;i<=n*2-1;i++){
            for(j=1;j<=n*2-1;j++){
                if(c>j){
                    System.out.print("-");
                } 
                else{
                    System.out.print("*");  
                }
                
            }
            if(i<n)c++;
                else c--;
                System.out.println();
        }
        
    }
}
