import java.util.*;
public class Matrixprint {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int i;
        int j;
        for(i=1;i<=n*2-1;i++){
            for(j=1;j<=n*2-1;j++){
                    System.out.print(" * "); 
                }
                System.out.println();
            }
        }
    }


