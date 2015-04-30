package firstapp;

public class Reverse 
{
    public String ReverseString(String input) 
    {
        
        String res = "";
        for(int i =input.length()-1; i>=0; i--)
        {
            char ch = input.charAt(i);
            res = res + ch;
            System.out.println("Result ::"+res);
        }
        return res;
    }
}
