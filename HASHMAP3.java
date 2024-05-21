import java.util.HashMap;
import java.util.Map;
public class HASHMAP3 {
    public static void main(String[] args)
    {
        Map<Integer,String> Students = new HashMap <Integer,String>();
        
         Students.put( 200789 , "Keerthana");
         Students.put( 200790 , "Velvizhi");
         Students.put( 200791 , "Dharsha");
         Students.put( 200792 , "Jeevasree");
    
        Students.put(200792 , "Janani");
        System.out.println("Students");
        System.out.println(Students);
    
    }
    
    
}
