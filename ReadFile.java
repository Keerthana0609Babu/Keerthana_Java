import java.io.FileReader;
import java.io.IOException;
public class ReadFile 
{
    public static void main(String args[]) throws IOException
    {
        FileReader fr = new FileReader("Variablz.txt");
        int i;
        while((i = fr.read()) != -1)
        System.out.println((char)i) ;
        fr.close();
    }
}
