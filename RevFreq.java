import java.util.*;
class Check
{
   void freq(String str1,int len)
   {
       int flag=0;
       System.out.print("Enter the character(in lower case) whose freq has to be found: ");
       Scanner obj1 = new Scanner(System.in);
       char c=obj1.next().charAt(0);
      for(int i=0;i<len;i++)
      {
        if(str1.charAt(i)==c)
        {
            flag++;
        }
      }
      if(flag==0)
      {
        System.out.println("The character is not present");
      }
       else
      {
        System.out.println("The character is present and the frequency of the character is:" +flag);
      }
    }
     void reverse(String str1,int len)
     {
        String rev="";
        for(int i=len-1;i>=0;i--)
        {
          rev=rev+str1.charAt(i);
        }
        
          System.out.println("Reversed String is: "+rev.toUpperCase());
        
      }
     

   
}

public class RevFreq 
{
    
    public static void main(String args[])
    {
       
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the string");
        String str=obj.nextLine();
        String str1=str.toLowerCase();
        int len=str1.length();
        Check obj1=new Check();
        obj1.freq(str1,len);
        obj1.reverse(str1,len);
    }

        
     
}
