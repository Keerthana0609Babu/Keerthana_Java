import java.util.Scanner;
public class RuntimeIO {
    public static void main(String[] args)
    {
        int x,y,z;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the value for x: ");
        x = obj.nextInt();
        System.out.println("Enter the value for y; ");
        y = obj.nextInt();
        z = ((x+y)*(x-y))/((x+y)*(x-y));
        System.out.println("z = "+z);
    }

    
}
