package ac.sgsits.in;

import java.util.Scanner;

public class Booking {
    public void cylinderbooking(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please select a payment method");
        System.out.println("1) Cash on delivery");
        System.out.println("2) Online(5% instant discount)");
        int payment;
        payment = scan.nextInt();
        if (payment == 1) {
            System.out.println("Please keep exact change on delivery");
        } else if (payment == 1) {
            System.out.println("Payment successful");
        }
    }
}
