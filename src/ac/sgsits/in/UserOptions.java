package ac.sgsits.in;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
                System.out.println("Cost for the cylinder: Rs. 650");
                System.out.println("Please select a payment method");
                System.out.println("Please select a payment method");
                System.out.println("1) Cash on delivery");
                System.out.println("2) Online(5% instant discount)");
                int payment;
                payment=scan.nextInt();
                if(payment==1){
                    System.out.println("Please keep exact change on delivery");
                } else if(payment==1){
                    System.out.println("Payment successful");
                }
                System.out.println("The cylinder will be delivered within 2 working days, have a good day!");
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
            user.DisplayProfile("Test User 1", id , "Indore");
        } else if(id==2 && passwd.equals("two")){
            UserOptions user = new UserOptions();
            user.DisplayProfile("Test User 1", id , "Ujjain");
        }
        else {
            System.out.println("Please SignUp");
        }
    }
}
