package ac.sgsits.in;

public class Sign implements Profile{
    int a;
    String name,id,address;
    public Sign(int a){
        this.a=a;
    }
    @Override
    public int Signin(){
        System.out.println("Welcome "+a);
        //network class depending on a
        return 0;
    }
    @Override
    public void DisplayProfile(String name,String id,String address){
        this.name=name;
        this.id=id;
        this.address=address;
        System.out.println(name);
        System.out.println(id);
        System.out.println(address);
    }
}
