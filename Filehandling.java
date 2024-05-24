import java.io.File;
import java.io.IOException;
public class Filehandling {
    public static void main(String[] args)
    {
        try{
            File myobj = new File("Variablz.csv");
            if(myobj.createNewFile())
            {
                System.out.println("----------File created----------" + myobj.getName());
            }
            else{
                System.out.println("----------File already exists---------");
            }
        }
        catch(IOException e)
        {
            System.out.println("----------An error occured----------"+e.toString());
        }
    }
}
