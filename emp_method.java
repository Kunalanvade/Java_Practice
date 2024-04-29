 import java.util.*;
 public class emp_method {
    int empid;
    String empname;
    int Salary;
    int deptno;

    public display()  {
        System.out.println(empid);
        System.out.println(empname);
        System.out.println(salary);
        System.out.println(deptno); 

           }
           public static void main (String[] args) {
            emp_method = new emp_method();
            emp.empid=100;
            emp.empname= "kunal";
            emp.salary=100;
            emp.deptno=4;
            emp.display();
            

           }

    
}
