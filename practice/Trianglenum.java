import java.util.*;
public class Trianglenum  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int odd = 0;
        int even = 0;
        for (int row = 1; row <= n; row++)
        {
            odd = row;
            for (int col = 1; col <= row; col++)
            {
                if(col%2 == 0)
                {
                    System.out.printf("%02d ",even);
odd = even + (row-col)*2;
                }
                else
                {
                    System.out.printf("%02d ",odd);
                    even = odd + ((n-(row-1))*2)-1;
                }
            }
            System.out.println();
        }
    }

    
}
