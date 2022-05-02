class Derived
{
    public void getDetails()
    {
        System.out.println("derived class");
    }
}
public class HelloWorld extends Derived {
    public void getDetails()
    {
        System.out.println("test class");
        super.getDetails();
    }
    public static void main(String[] args) {
        Derived obj=new HelloWorld();
       obj.getDetails();
    }
}