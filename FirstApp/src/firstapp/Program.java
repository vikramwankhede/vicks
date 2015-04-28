package firstapp;

public class Program 
{
    Desk des = new Desk();
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
        des.desk();
        System.out.println();
        git.git();
        System.out.println();
        github.gitHub();
        
        for (int i =0;i < 2; i++)
        {
            
            System.out.println("My name is Barrey Allen");
            System.out.println();
            
        }
        
    }
}





