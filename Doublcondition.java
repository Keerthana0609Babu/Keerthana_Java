import java.util.Scanner;
public class Doublcondition {
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner (System.in);
        System.out.println("Enter your age: ");
        String userinput = obj.nextLine();
        int age = Integer.parseInt(userinput);
        if(age<=10)
        System.out.println("Recommended cartoons");
        else 
        System.out.println("Recommended Horror Movies");
    }
    
}
