import java.security.PublicKey;

class Standard_account
{
    private int deliveries = 7;
    String welcomeMessage = "Welcome to amazon account";
    String name,mobile_no,mail_id;
    public Standard_account(String name, String mobile_no, String mail_id)
    {
        this.name=name;
        this.mobile_no=mobile_no;
        this.mail_id=mail_id;
    }
    void shopping(String item)
    {
        System.out.println(name+" bought "+item);
    }
    void delivery()
    {
        System.out.println("Your order will be delivered in "+deliveries+" days");
    }
    void deactivate_account()
    {
        System.out.println(name+" account deactivated successfully");
    }

}
    class Premium_account extends Standard_account
    {
        String WelcomeMessage = "Welcome to Amazon Account";
        int premiun_delivery = 1;
        public Premium_account(String name,String mobileno,String mail_id)
        {
            super(name,mobileno,mail_id);
        }
        void delivery(String premium_delivery)
        {
            super.delivery();
            System.out.println(WelcomeMessage);
            System.out.println("Your order will be delivered in "+ premium_delivery +" days");
        }
        void prime_video()
        {
            System.out.println("Prime video membership enabled!");
        }
        void cancel_Membership()
        {
            System.out.println(name+" successfully cancelled the membership!");
        }
    }
    public class Inheritance 
    {
        public static void main(String[] args) 
        {
            Premium_account view = new Premium_account("Keerthana", "9363733822", "keersbabu0609@gmail.com");
            view.shopping("Ear buds");
            view.delivery();
            view.deactivate_account();
            view.prime_video();
            view.cancel_Membership();
        }
    }
