package ac.sgsits.in;

import java.util.Scanner;

public class Welcome {
    public static void main(String a[]) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("\n\n**********************************************************************");
        System.out.println("**********************************************************************");
        System.out.println("*********     WELCOME TO GS GAS REFILL MANAGEMENT SYSTEM     *********");
        System.out.println("**********************************************************************");
        System.out.println("**********************************************************************");

        System.out.println("\n\n\n\t\tProject Made by : ");
        System.out.println("Maulik Ramnani      ( 0801CS181039 )");
        System.out.println("Abhi jain           ( 0801CS181003 )");

        System.out.println("\n\nPlease select a login type : \n\t1. Customer\n\t2. Supplier");
        final int opt1 =scanner.nextInt();


        if(opt1==1)
        {
            Consumer cons = new Consumer(opt1);
        }

        else if(opt1==2)
        {
            Supplier sup = new Supplier(opt1);
        }

    }

}
