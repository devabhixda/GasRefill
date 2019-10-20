package ac.sgsits.in;

import java.time.LocalDate;

public class Billing
{
    public void BillGenerate(int custno, String name )
    {
        int billid=custno+3;                      // bill id
        String cylntype="CNG";                    // cylinder tyoe
        double amt=650.49;                        // amount

        LocalDate bkdate=LocalDate.now();         // booking date
        LocalDate deldate=bkdate.plusDays(3);     // delivery date

        System.out.println("\n\t\t ******* Bill *******");

        System.out.println("\nBill id: " + billid);
        System.out.println("Cylinder type: " + cylntype);
        System.out.println("Booking date: " + bkdate);
        System.out.println("Delivery date: " + deldate);
        System.out.println("Amount: " + amt);
    }
}
