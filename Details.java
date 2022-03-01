
import java.util.Scanner;

class Employee
{
    String ename;
    int eId;
    int eno;
    void info()
    {
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter Name of the employee");
        ename=obj1.nextLine();
        System.out.println("Enter the employee Id");
        eId=obj1.nextInt();
        System.out.println("Enter the employee phn no");
        eno=obj1.nextInt();
    }
    void display()
    {
        System.out.println("Name of the Employee: "+ename);
    
        System.out.println("Employee Id: "+eId);
        
        System.out.println("Employee phn no: "+eno);
       
    }
    
    
}
public class Details 
{
    public static void main(String args[])
    { 
       Employee obj = new Employee();
       Scanner obj2= new Scanner(System.in);
       System.out.println("Enter the no Employees");
       int n=obj2.nextInt();
       for(int i=0;i<n;i++)
       {
        
         obj.info();
         obj.display();
         System.out.println("\n\n");
       }
       
      
    }
}
/*
Enter the no Employees
2
Enter Name of the employee
manoj
Enter the employee Id
4321
Enter the employee phn no
265435
Name of the Employee: manoj
Employee Id: 4321
Employee phn no: 265435

Enter Name of the employee
sooraj
Enter the employee Id
4328
Enter the employee phn no
2776543
Name of the Employee: sooraj
Employee Id: 4328
Employee phn no: 2776543
*/
