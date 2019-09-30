package ac.sgsits.in;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to GS gas!");
        System.out.println("Please select a login type");
        Scanner scanner=new Scanner(System.in);
        final int a=scanner.nextInt();
        if(a==1){
            Consumer cons=new Consumer(a);
        }else if(a==2){
            Supplier sup=new Supplier(a);
        }
    }
}
