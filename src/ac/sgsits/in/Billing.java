package ac.sgsits.in;

import java.time.LocalDate;
public class Billing extends Date implements Transaction{
    public void BillGenrerate(int custno){
        int billid=custno+3;          // bill id
        String cylntype="CNG";     // cylinder tyoe
        LocalDate bkdate=LocalDate.now();    // booking date
        LocalDate deldate=bkdate.plusDays(3);   // delivery date
        double amt=650.49;           // amount
        System.out.println("Bill id: " + billid);
        System.out.println("Cylinder type: " + cylntype);
        System.out.println("Booking date: " + bkdate);
        System.out.println("Delivery date: " + deldate);
        System.out.println("Amount: " + amt);
    }
}
