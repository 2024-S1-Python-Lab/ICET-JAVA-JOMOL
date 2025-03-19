import java.util.Scanner;
class Person{
    String name,gender,addr;
    int age;
    Person(String name,String gender,String addr,int age){
        this.name=name;
        this.gender=gender;
        this.addr=addr;
        this.age=age;
    }
}
class Employee extends Person{
    int empid;
    String compname,qual;
    double salary;
    Employee(String name,String gender,String addr,int age,int empid,String compname,String qual,double salary){
        super(name,gender,addr,age);
        this.empid=empid;
        this.compname=compname;
        this.qual=qual;
        this.salary=salary;
    }
}
class Teacher extends Employee{
    String sub,dept;
    int tid;
    Teacher(String name,String gender,String addr,int age,int empid,String compname,String qual,double salary,String sub,String dept,int tid){
        super(name,gender,addr,age,empid,compname,qual,salary);
        this.sub=sub;
        this.dept=dept;
        this.tid=tid;
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Gender :"+gender);
        System.out.println("Address:"+addr);
        System.out.println("Age:"+age);
        System.out.println("Employee id:"+empid);
        System.out.println("company name:"+compname);
        System.out.println("qualification :"+qual);
        System.out.println("salary :"+salary);
        System.out.println("Subject:"+sub);
        System.out.println("department:"+dept);
        System.out.println("Teacher id :"+tid);
    }
}
public class multilevelteacher{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of teachers");
        int n=sc.nextInt();
        Teacher[] teachers=new Teacher[n];
        System.out.println("Enter details for teacher");
        for(int i=0;i<n;i++){
            System.out.print("Name :");
            String name=sc.next();
            System.out.print("Gender :");
            String gender=sc.next();
            System.out.print("address");
            String addr=sc.next();
            System.out.print("age:");
            int age=sc.nextInt();
            System.out.print("Employee id:");
            int empid=sc.nextInt();
            System.out.print("Company name:");
            String compname=sc.next();
            System.out.print("qualification :");
            String qual=sc.next();
            System.out.print("salary :");
            double salary=sc.nextDouble();
            System.out.print("subject :");
            String sub=sc.next();
            System.out.print("department :");
            String dept=sc.next();
            System.out.print("teacher id :");
            int tid=sc.nextInt();
            teachers[i]=new Teacher(name,gender,addr,age,empid,compname,qual,salary,sub,dept,tid);


        }
        System.out.print("\n Details of teachers");
        for(Teacher i:teachers){
            i.display();
            System.out.println();
        }
    }
}