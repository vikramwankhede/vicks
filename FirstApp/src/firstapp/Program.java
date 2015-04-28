package firstapp;

public class Program 
{
    Git git = new Git();
    Github github = new Github();
    public static void main(String[] args) 
    {
        Program obj = new Program();
        obj.printName();
        System.out.println("First Program : Run Successfully ");
    }
    public  void printName() 
    {
        git.git();
        github.gitHub();
        for (int i =0;i < 3; i++)
        {
            System.out.println("My name is Barrey Allen");
            
        }
        
    }
}





