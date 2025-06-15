package Oops;

public class Employee {
    int e_Id;
    String e_Name;
    float e_Salary;
    public void emp_detail(){
        System.out.println("id is "+e_Id);
        System.out.println("name is "+e_Name);
        System.out.println("salary is "+e_Salary+"$");

    }
    public static void main(String args[]){
        Employee e1=new Employee();
        Employee e2=new Employee();
        e1.e_Id=1;
        e1.e_Name="Mohan";
        e1.e_Salary=221.891f;

        e2.e_Id=2;
        e2.e_Name="John";
        e2.e_Salary=867.653f;

        e1.emp_detail();
        System.out.println();

        e2.emp_detail();
        System.out.println();
        e2.e_Salary=232.4f;
        e2.emp_detail();


    }
}
