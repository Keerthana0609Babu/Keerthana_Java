import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class WritingFile {
    public static void main(String[] args) {
        try
        {
            FileWriter file = new FileWriter("Variablz.csv");
            file.write("S.no,Name,Course\n001,Keerthana,JAVA\n002,Velvizhi,PYTHON");
            file.close();
            System.out.println("_____Successfully wrote to the file_____");
        }
        catch(IOException x)
        {
            System.out.println("An error occured."+x.toString());
        }

        
    }
    
}
