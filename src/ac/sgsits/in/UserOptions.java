package ac.sgsits.in;

import java.util.Scanner;

public class UserOptions implements Profile{
    String name,address;
    int id;
    @Override
    public void DisplayProfile(String name,int id,String address){
        this.name=name;
        this.id=id;
        this.address=address;
        System.out.println("Welcome " + name);
        System.out.println("Please select a service option");
        System.out.println("1) Book a cylinder");
        System.out.println("2) View details of last book cylinder");
        Scanner scan=new Scanner(System.in);
        int choice=scan.nextInt();
        switch (choice){
            case 1:
                Billing userthis = new Billing();
                Booking myuser = new Booking();
                userthis.BillGenerate(id,name);
                String bchoice;
                System.out.println("Press y to continue");
                bchoice = scan.next();
                try {
                    if(bchoice.equals("y")) {
                        myuser.cylinderbooking();
                    }
                } finally {
                    System.out.println("Thanks for using GS Gas refill management system");
                }
            break;
            case 2: System.out.println("Case 2");
            break;
            default: System.out.println("Invalid input");
        }
    }

    public static void authenticate(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your id: ");
        int id = scan.nextInt();
        System.out.print("Enter your password: ");
        String passwd = scan.next();
        if(id==1 && passwd.equals("one")){
            UserOptions user = new UserOptions();
            user.DisplayProfile("Test User", id , "Indore");
        } else if(id==2 && passwd.equals("two")){
            UserOptions user = new UserOptions();
            user.DisplayProfile("Test User", id , "Ujjain");
        }
        else {
            System.out.println("Please SignUp");
        }
    }
}
