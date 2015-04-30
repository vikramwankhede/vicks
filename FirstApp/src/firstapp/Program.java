package firstapp;

import java.util.Scanner;

public class Program 
{
    static String input;
    Desk des = new Desk();
    Git git = new Git();
    Github github = new Github();
    
    public static void main(String[] args) 
    {
        Program obj = new Program();
        obj.printName();
        System.out.println("First Program : Run Successfully ");
        System.out.println("Please Enter your name ");
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        System.out.println("Welcome : " + input);
        Reverse rev = new Reverse();
        rev.ReverseString(input);   
        
        System.out.println("Please Enter your Surname ");
       
        input = sc.nextLine();
        System.out.println("Welcome : " + input);
       
        rev.ReverseString(input);  
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
            System.out.println();    
        } 
    }
}





