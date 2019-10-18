package ac.sgsits.in;

import java.time.LocalDate;

public interface Transaction {
    int TId=0;                                      // Transaction Id
    int Consno=0;                                   // Customer Id
    String Cname=null;                              // Customer Name
    String Caddr=null;                              // Customer address
    String Cylntype=null;                           // Cylinder Type
    LocalDate Bkdt= LocalDate.ofEpochDay(10);       // booking date
    LocalDate Deldt= LocalDate.ofEpochDay(12);      // delivery date
    String Status = null;                           // Status of transaction


}
