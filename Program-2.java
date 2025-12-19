import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner ar = new Scanner(System.in);
        int a = ar.nextInt();
        int t = 1;

        for (int i = 1; i <= a; i++) 
        {
            if (i == a) 
            {
                System.out.print(t);
            } 
            else 
            {
                System.out.print(t + ", ");
            }
            t = t + 2;
        }
    }
}
