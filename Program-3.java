import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner ar = new Scanner(System.in);
        int a = ar.nextInt();
        int c;
        if(a % 2 == 0) 
        {
            c = a - 1;
        } 
        else 
        {
            c= a;
        }
        int t = 1;
        for (int i = 1; i <= c; i++) 
        {
            if (i == c) 
            {
                System.out.print(t);
            } 
            else 
            {
                System.out.print(t+ ", ");
            }
            t = t + 2;
        }
    }
}
