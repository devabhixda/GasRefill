package ac.sgsits.in;

import java.time.LocalDate;

public class Billing extends Date implements Transaction{
    int billid;          // bill id
    int custno;          // customer no.
    String cylntype;     // cylinder tyoe
    LocalDate bkdate;    // booking date
    LocalDate deldate;   // delivery date
    float amt;           // amount


}
