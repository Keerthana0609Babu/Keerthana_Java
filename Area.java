import java.util.Scanner;
public class Area {
    static int a;
    static double l,b;
    static float r;
    void area(int a)
    {
        this.a=a;
    }
    void area(double l, double b)
    {
        this.l=l;
        this.b=b;
    }
    void area(float r)
    {
        this.r=r;
    }
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter side: ");
        a = obj.nextInt();
        System.out.println("Area of the square is "+(a*a));
        System.out.print("Enter length: ");
        l = obj.nextInt();
        System.out.print("Entre breath: ");
        b = obj.nextInt();
        System.out.println("Area of the recyangle is "+(l*b));
        System.out.print("Enter radius: ");
        r = obj.nextInt();
        System.out.println("Area of the circle is "+(3.14*(r*r)));
    }
    
}
