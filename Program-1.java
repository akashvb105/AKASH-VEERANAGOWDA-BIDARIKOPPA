import java.util.*;
class Calculator 
{
    double a;
    double b;
    String op;
    Calculator(double x, double y, String o)
    {
        a = x;
        b = y;
        op = o;
    }
    double calculate() 
    {
        if (op.equals("add"))
            return a + b;
        else if (op.equals("sub"))
            return a - b;
        else if (op.equals("mul"))
            return a * b;
        else if (op.equals("div"))
            return a / b;
        else
            return 0;
    }
}

public class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        String op = sc.next();
        Calculator cal = new Calculator(a, b, op);
        System.out.println(cal.calculate());
        sc.close();
    }
}
