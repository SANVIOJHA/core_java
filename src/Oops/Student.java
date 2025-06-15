package Oops;

public class Student {
    //data:data members:instance variable
    int stu_Id;
    String stu_Name;
    String stu_city;
    int stu_Marks;
public void study(){

    System.out.println("name is "+stu_Name);
    System.out.println(stu_Name+" is studying ");
    System.out.println("city is "+stu_city);
}

public void stuDetail(){
    System.out.println("id is "+stu_Id);
    System.out.println("name is "+stu_Name);
    System.out.println("city is "+stu_city);
    System.out.println("id is "+stu_Marks);

}
public static void main(String args[]){
    Student st1=new Student();

    st1.stu_Id=1;
    st1.stu_Name="Ram";
    st1.stu_city="Punjab";
    st1.stu_Marks=43;

    st1.study();
    System.out.println();
    st1.stuDetail();

}

}
