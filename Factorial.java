import java.util.*;
public class Factorial 
{
    void Fact(int p)
    {
        int prod=1;
        for(int i=1;i<=p;i++)
        {
           prod=prod*i;
        }
        System.out.println("Factorial is:"+prod);
    }
    void sum(int m)
    {
        int r,sum=0;
        while(m!=0)
        {
           r=m%10;
           sum=sum+r;
           m=m/10;
        }
        
        System.out.println("The sum of digits of given num is:"+sum);
    }
    public static void main(String args[])
    {
        int n,q;
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter the number whose factorial has to be calculated");
        n=obj.nextInt();
        System.out.println("Enter the number whose sum of digits has to be calculated");
        q=obj.nextInt();
        Factorial obj1 =new Factorial();
        obj1.Fact(n);
        obj1.sum(q);
    }
}
/*
Enter the number whose factorial has to be calculated
5
Enter the number whose sum of digits has to be calculated
55
Factorial is:120
*/
The sum of digits of given num is:10
