package ac.sgsits.in;

public class Consumer{
    static int a;
    public Consumer(int a){
        this.a=a;
        System.out.println("Customer");
        Sign s=new Sign(a);
        s.Signin();
        s.DisplayProfile("Abhi","1234","Palasia");
    }
}
