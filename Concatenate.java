import java.util.*;
class Method 
{
    void Concat(int x,int y)
    {
        System.out.println("Concatenated Numbers is "+x+y); 
    }
    void Concat(String p,String q)
    {
       
        System.out.println("Concatenated String is  "+p+q); 
    }
}
public class Concatenate
{
    public static void main(String args[])
    {
        Method obj=new Method();
        Scanner obj1=new Scanner(System.in);
        Scanner obj2=new Scanner(System.in);
        System.out.println("Enter any 2 Numbers");
        int x=obj1.nextInt();
        int y=obj1.nextInt();
        System.out.println("Enter any 2 Strings");
        String q=obj2.nextLine();
        String s=obj2.nextLine();
        
        obj.Concat(x,y);
        
        
        obj.Concat(q,s);
    }
}
