import java.util.HashMap;
import java.util.Scanner;
public class Hashmap {
    public static void main(String[] args)
    {
        HashMap<Integer,String> Colours = new HashMap <Integer,String>();
        Colours.put(1 , "Blue");
        Colours.put(2 , "Red");
        Colours.put(3 , "Green");
        Colours.put(4 , "Black");
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the key: ");
        int key = obj.nextInt();
        boolean containsKey = Colours.containsKey(key);
        if(containsKey){
            Colours.remove(key);

        }else{
            System.out.println("The colour "+ key +" not present.");
        }
        Colours.remove(key);
        System.out.println("COLOURS: "+Colours);
}
    
}

