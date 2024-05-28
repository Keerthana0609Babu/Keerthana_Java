class Student
{
    String name;
    int rno;
    Student(String name, int rno)
    {
        this.name = name;
        this.rno = rno;
    }
    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Roll. no: "+rno);
    }
}
class Marks extends Student
    {
        int m1,m2,m3;
        Marks(String name, int rno, int m1, int m2, int m3)
        {
        
            super(name,rno);
            this.m1=m1;
            this.m2=m2;
            this.m3=m3;
        }
        void display()
        {
            super.display();
            System.out.println("Mark 1: "+m1);
            System.out.println("Mark 2: "+m2);
            System.out.println("Mark 3: "+m3);
        }
    }
public class Super 
{
    public static void main(String[] args) 
    {
        Marks obj = new Marks("Keerthana", 1001, 99,89,89);
        obj.display();
    }
}


