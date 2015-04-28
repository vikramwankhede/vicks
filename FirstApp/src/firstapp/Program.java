package firstapp;

public class Program 
{
    Git github = new Git();
    public static void main(String[] args) 
    {
        Program obj = new Program();
        obj.printName();
        System.out.println("First Program : Run Successfully ");
    }
    public  void printName() 
    {
        for (int i =0;i < 3; i++)
        {
            System.out.println("My name is Barrey Allen");
            github.git();
        }
        
    }
}





