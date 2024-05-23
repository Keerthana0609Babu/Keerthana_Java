public class Exceptionhandling {
    public static void main(String[] args) {
        try 
        {
            int[] a = new int[2];
            int b = 0;
            int c = 1/b;
            System.out.println("ACCESS THE ELEMENT HERE "+a[3]);  
        }
        catch(ArithmeticExceptionException e )
        {
            System.out.println(e.toString());
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.toString());        
        }
        catch(Exception e )
        {
            System.out.println("Exception");
        }System.out.println("out of the block");
    }
    
}
