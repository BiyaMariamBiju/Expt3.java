import java.util.Scanner;
class Find
{
    void calc(int r)
    {
        System.out.println("Area of circle="+(3.14*r*r));
    }
    void calc(int l,int b)
    {
        System.out.println("Area of Rectangle="+(l*b));
    }
    void calc(float h,float bs)
    {
        System.out.println("Area of Triangle="+(0.5*h*bs));
    }
}
public class Area 
{  
    public static void main(String args[])
    {
      Find obj = new Find();
      Scanner obj1=new Scanner(System.in);
      System.out.println("Enter the radius of the circle");
      int r=obj1.nextInt();
      System.out.println("Enter the length and breadth of the rectangle");
      int l=obj1.nextInt();
      int b=obj1.nextInt();
      System.out.println("Enter the height and base of the rectangle");
      float h=obj1.nextInt();
      float bs=obj1.nextInt();
      obj.calc(r);
      obj.calc(l,b);
      obj.calc(h,bs);
    }

    
}
