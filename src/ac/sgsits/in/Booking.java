package ac.sgsits.in;

import java.util.Scanner;

public class Booking
{
    public void cylinderbooking()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nPlease select a payment method : ");
        System.out.println("\t1) Cash on delivery");
        System.out.println("\t2) Online(5% instant discount) ");

        int payment = scan.nextInt();

        if (payment == 1)
        {
            System.out.println("\t Please keep exact change on delivery !!");
        }

        else if (payment == 2)
        {
            System.out.println("\t Payment successful :)");
        }
    }
}
