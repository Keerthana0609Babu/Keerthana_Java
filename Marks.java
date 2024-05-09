public class Marks {

    public static void main(String[] args)
    {
        String Name;
        int Tam, Eng, Mat, Phy, Che, CS;
        int Total; 
        float Average;
        Name = args[0];
        Tam = Integer.parseInt(args[1]);
        Eng = Integer.parseInt(args[2]);
        Mat = Integer.parseInt(args[3]);
        Phy = Integer.parseInt(args[4]);
        Che = Integer.parseInt(args[5]);
        CS = Integer.parseInt(args[6]);
        Total = Tam + Eng + Mat + Phy + Che + CS;
        Average = Total/6;
        System.out.println("Name"+Name);
        System.out.println("Total"+Total);
        System.out.println("Average"+Average); 
    }
}