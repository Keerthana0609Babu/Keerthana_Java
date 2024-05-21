import java.util.HashMap;
import java.util.Map;
public class HASHMAP{
    public static void main(String[] args)
    {
    
        Map<Integer,String> Students = new HashMap <Integer,String>()
        {{
         put( 200789 , "Keerthana");
         put( 200790 , "Velvizhi");
         put( 200791 , "Dharsha");
         put( 200792 , "Jeevasree");
        }};
       
        boolean containsKey = Students.containsKey(200798654);
        if (containsKey)
        
            System.out.println("-------The Student is present-------");
        else
        
            System.out.println("-------The Student is absent-------");
        

    }
    
}
