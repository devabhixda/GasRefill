package ac.sgsits.in;

import java.time.LocalDate;
<<<<<<< HEAD
public class Billing extends Date implements Transaction{
    public void BillGenerate(int custno, String name){
        int billid=custno+3;          // bill id
        String cylntype="CNG";     // cylinder tyoe
        LocalDate bkdate=LocalDate.now();    // booking date
        LocalDate deldate=bkdate.plusDays(3);   // delivery date
        double amt=650.49;           // amount
        System.out.println("Name: " + name);
        System.out.println("Bill id: " + billid);
=======

public class Billing
{
    public void BillGenrerate(int custno)
    {
        int billid=custno+3;                      // bill id
        String cylntype="CNG";                    // cylinder tyoe
        double amt=650.49;                        // amount

        LocalDate bkdate=LocalDate.now();         // booking date
        LocalDate deldate=bkdate.plusDays(3);     // delivery date

        System.out.println("\n\t\t ******* Bill *******");

        System.out.println("\nBill id: " + billid);
>>>>>>> a204b607453f780495bbc25199250bac9f5d22b7
        System.out.println("Cylinder type: " + cylntype);
        System.out.println("Booking date: " + bkdate);
        System.out.println("Delivery date: " + deldate);
        System.out.println("Amount: " + amt);
    }
}
