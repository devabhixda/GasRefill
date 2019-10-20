package ac.sgsits.in;

import java.util.Scanner;

public class Supplier
{
    static int a;
    Scanner scanner=new Scanner(System.in);

    public Supplier(int a)
    {

            this.a=a;

            System.out.println("\nWelcome to the admin panel ! ");

                AdminOptions ad = new AdminOptions();
                ad.authenticate();
    }
}
