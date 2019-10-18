package ac.sgsits.in;

import java.util.Scanner;

public class Consumer{

    static int a;
    Scanner scanner=new Scanner(System.in);

    public Consumer(int a)
    {
        this.a=a;


        System.out.println("Please select from the following option : \n\t1. SignUp\n\t2. SignIn");
        int opt2 = scanner.nextInt();


        if(opt2==1)
        {
            Sign s = new Sign(opt2);
        }

        else if(opt2==2)
        {
            SignUp su = new SignUp();
        }


    }
}
