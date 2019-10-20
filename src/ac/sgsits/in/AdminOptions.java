package ac.sgsits.in;

import java.util.Scanner;
import java.time.LocalDate;

public class AdminOptions extends Billing implements Profile
{
    String name;
    int id;

    public void AdminProfile(String name, int id)
    {
        this.name=name;
        this.id=id;

        System.out.println("\n\nWelcome " + name);
        System.out.println("Please select a service option : ");

        System.out.println("\n\t1) See Past Bookings");
        System.out.println("\t2) View Upcoming Bookings");
        Scanner scan=new Scanner(System.in);

        int choice=scan.nextInt();
        switch (choice)
        {
            case 1 :
                System.out.println("\n\n ##  1  ##");
                Billing Adminthis = new Billing();
                Adminthis.BillGenrerate(id);

                System.out.println("\n\n ##  2  ##");
                Adminthis.BillGenrerate(id+2);

            break;

            case 2: System.out.println("   ***   Case 2   ***  ");
                    break;

            default: System.out.println("Invalid input");
        }
    }

    public static void authenticate()
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("\nEnter your id: ");
        int id = scan.nextInt();

        System.out.print("Enter your password: ");
        String passwd = scan.next();

        if(id==1 && passwd.equals("one"))
        {
            AdminOptions user = new AdminOptions();
            user.AdminProfile("Maulik",id);
        }

        else if(id==2 && passwd.equals("two"))
        {
            AdminOptions user = new AdminOptions();
            user.AdminProfile("Abhi", id);
        }
        else {
            System.out.println("Account doesn't exist , Please SignUp !!");
        }
    }

    public void DisplayProfile(String name,int id,String address){

    }
}
