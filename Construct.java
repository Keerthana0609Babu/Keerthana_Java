public class Construct 
{
    String msg;
    public Construct()
    {
        msg = "Object Created";
        System.out.print(msg);
    }
    public Construct(String name, String address)
    {
        System.out.println("Nama is "+name);
        System.out.println("Address i "+address);
    }
    protected void finalizer()
    {
        msg = "Object is destroyed";
        System.out.println();
    }
    
}
class Constructor
{
    public static void main(String[] args) 
    {
        Construct view = new Construct();
        Construct view1 = new Construct("Keerthana","Chavady");
        view.finalizer();
        view1.finalizer();
    }
}
