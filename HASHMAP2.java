import java.util.HashMap;
import java.util.Map;
public class HASHMAP2 {

    public static void main(String[] args)
    {
        var Students = new HashMap <>()
        {{
         put( 200789 , "Keerthana");
         put( 200790 , "Velvizhi");
         put( 200791 , "Dharsha");
         put( 200792 , "Jeevasree");
    }};
    int size = Students.size();
        System.out.println("Students: "+Students);
        System.out.println("Total no. of students: "+size);;
    }
    
}

    

