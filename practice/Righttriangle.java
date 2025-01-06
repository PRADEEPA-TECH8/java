import java.util.*;

public class Righttriangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int i;
        int j;
        int c=1;
        for(i=0;i<=n*2-1;i++){
            int num = i;
            for(j=1;j<=n*2-1;j++){
                if(c-j>n*2){
                    System.out.print(num++ +" ");
                } 
                else if(c+j>n*2){
                    System.out.print(num +" ");  
                }
                else{
                    System.out.print(""); 
                }
            }
            if(i<=j) c++;
            else c--;
            System.out.println();
        }
        
    }
}