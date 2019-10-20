package ac.sgsits.in;

import java.util.Scanner;

public class UserOptions implements Profile
{
    String name,address;
    int id;

    @Override
    public void DisplayProfile(String name,int id,String address)
    {
        this.name=name;
        this.id=id;
        this.address=address;

        System.out.println("\n\n\tWelcome " + name);
        System.out.println("Please select a service option : ");
        System.out.println("\n\t1) Book a cylinder");
        System.out.println("\t2) View details of last book cylinder");

        Scanner scan=new Scanner(System.in);

        int choice=scan.nextInt();

        switch (choice)
        {
            case 1:
                Billing userthis = new Billing();
                Booking myuser = new Booking();
                userthis.BillGenerate(id,name);
                String bchoice;

                System.out.println("\nPress y to continue : ");
                bchoice = scan.next();

                try {
                    if(bchoice.equals("y"))
                    {
                        myuser.cylinderbooking();
                    }
                }

                finally
                {
                    System.out.println("\nThanks for using GS Gas refill management system");
                }

            break;

            case 2: System.out.println("Case 2");
            break;

            default: System.out.println("\n\tInvalid input");
        }
    }

    public static void authenticate()
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("\n\tEnter your id : ");
        int id = scan.nextInt();

        System.out.print("\tEnter your password : ");
        String passwd = scan.next();

        if (id == 1 && passwd.equals("one"))
        {
            UserOptions user = new UserOptions();
            user.DisplayProfile("Maulik Ramnani", id, "Indore");
        }

        else if (id == 2 && passwd.equals("two"))
        {
            UserOptions user = new UserOptions();
            user.DisplayProfile("Abhi jain", id, "Ujjain");
        }

        else
        {
            System.out.println("Account doesn't exist , Please SignUp !!");
        }
    }

    public void AdminProfile(String name, int id) {
        }


}
