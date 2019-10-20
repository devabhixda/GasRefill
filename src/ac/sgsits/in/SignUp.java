package ac.sgsits.in;

import java.util.ArrayList;
import java.util.Scanner;

public class SignUp {
    class Data
    {
        String name;
        String city;
        long phone;
        Data(String name, String city , long phone)
        {
            this.name = name;
            this.city = city;
            this.phone = phone;
        }
    }
    public void NewUser(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=scan.nextLine();
        System.out.println("Please enter your city");
        String city=scan.nextLine();
        System.out.println("Please enter your phone no.");
        long phone=scan.nextLong();
        SignUp custom = new SignUp();
        custom.addValues(name, city, phone);
    }
    public void addValues(String name, String city, long phone)
    {
        ArrayList<Data> list=new ArrayList<>();
            list.add(new Data(name, city, phone));
            AutoSign(list);
    }
    public void AutoSign(ArrayList<Data> list){
        Data data = list.get(0);
        UserOptions user = new UserOptions();
        user.DisplayProfile(data.name,3,data.city);
    }
}
