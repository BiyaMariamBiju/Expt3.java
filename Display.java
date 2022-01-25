
import java.util.*;
 class Student
{ 
    void show()
    {
       int i,sum=0;
       
       Scanner obj=new Scanner(System.in);
       String name;
       System.out.println("Enter the name");
       name=obj.nextLine();
       int rollno;
       System.out.println("Enter the rollno");
      
       rollno=obj.nextInt();
       int[] marks= new int[5];
       System.out.println("Enter the marks out of 100");
       for(i=0;i<5;i++)
       {
          marks[i]=obj.nextInt();
       }
       for(i=0;i<5;i++)
       {
          sum=sum+marks[i];
       }
      
       System.out.println("Name="+name+"\nRollno="+rollno+"\nTotal Mark:"+sum);
       
    }


}
public class Display
{
    public static void main(String args[])
    {
        Student obj1 =new Student();
        obj1.show();
    }
}