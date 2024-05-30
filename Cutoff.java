import java.util.Scanner;
public class Cutoff {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Name: Keerthana\nExam.no: 6567949");
        int m,p,c;
        float cutoff;
        System.out.println("Mathematics: ");
        m = obj.nextInt();
        System.out.println("Physics: ");
        p = obj.nextInt();
        System.out.println("Chemistry: ");
        c = obj.nextInt();
        cutoff = m+(p/2)+(c/2);
        System.out.println("Your cutoff is: "+cutoff);
    
    }
    
}
