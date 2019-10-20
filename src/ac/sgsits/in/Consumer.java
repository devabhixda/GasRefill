package ac.sgsits.in;

import java.util.Scanner;

public class Consumer
{
    static int a;
    Scanner scanner=new Scanner(System.in);

    public Consumer(int a)
    {
        this.a=a;

        System.out.println("\nPlease select from the following option : \n\t1. SignUp\n\t2. SignIn");
        int opt2 = scanner.nextInt();

        if(opt2==2)
        {
            UserOptions user = new UserOptions();
            user.authenticate();
        }

        else if(opt2==1)
        {
            SignUp user = new SignUp();
            user.NewUser();
        }

    }
}
