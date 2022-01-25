import java.util.*;
public class Perimeter 
{
    Perimeter(int r)
    {
        System.out.println("Perimeter of the circle is:"+(2*3.14*r));
    }
    Perimeter(int l,int b)
    {
        System.out.println("Perimeter of the rectangle is:"+(2*(l+b)));
    }
    public static void main(String args[])
    {
      
      Scanner obj=new Scanner(System.in);
      System.out.println("Enter the radius of the circle");
      int r=obj.nextInt();
      System.out.println("Enter the length and breadth of the rectangle");
      int l=obj.nextInt();
      int b=obj.nextInt();
      Perimeter obj1 = new Perimeter(r);
      Perimeter obj2 = new Perimeter(l,b);
      
    }
 
}
