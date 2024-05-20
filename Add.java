import java.util.List;
import java.util.ArrayList;
public class Add {
    public static void main(String[] args)
    {
        List <String> books = new ArrayList<>()
        {
            {
            add ("Dart");
            add ("SQL");
            add ("Flutter");
            add ("Django");

        }
    
    };
            System.out.print("\nBOOKS:");
            System.out.print(books);
    }
    
}
