import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner ar = new Scanner(System.in);
        System.out.print("n = ");
        int n = ar.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) 
        {
            a[i] = ar.nextInt();
        }
        int[] t = new int[10]; 
        for (int i = 1; i <= 9; i++) 
        {
            for (int j = 0; j <n; j++) 
            {
                if (a[j] % i == 0) 
                {
                    t[i]++;
                }
            }
        }
        System.out.print("{");
        for (int i = 1; i <= 9; i++) 
        {

            if (i == 9) 
            {
                System.out.print(i +": " + t[i]);
            } 
            else 
            {
                System.out.print(i+ ": " + t[i] + ", ");
            }
        }
        System.out.println("}");
    }
}
