import java.util.Scanner;
class Employee{
    protected int empid;
    protected String name;
    protected double salary;
    protected String address;
    public Employee (int empid,String name,double salary,String address){
        this.empid=empid;
        this.name=name;
        this.address=address;
    }
}
class Teacher extends Employee{
    private String dept;
    private String sub;
    public Teacher(int empid,String name,double salary,String address,String dept,String sub){
        super(empid,name,salary,address);
        this.dept=dept;
        this.sub=sub;
    }
    public void display(){
        System.out.println("Employee ID:"+empid);
        System.out.println("Name :"+name);
        System.out.println("Salary :"+salary);
        System.out.println("Address :"+address);
        System.out.println("Department:"+dept);
        System.out.println("Subjects Taught :"+sub);
        System.out.println();
    }
}
    public class TeacherArrOb{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the number of teachers:");
            int N=sc.nextInt();
            sc.nextLine();
            Teacher[] teachers=new Teacher[N];
            System.out.println("Enter details for teacher");
            for(int i=0;i<N;i++){
                System.out.print("Employee ID:");
                int empid=sc.nextInt();
                sc.nextLine();
                System.out.print("Name");
                String name=sc.nextLine();
                System.out.print("Salary :");
                double salary=sc.nextDouble();
                sc.nextLine();
                System.out.print("Addres :");
                String address=sc.nextLine();
                System.out.print("Department :");
                String dept=sc.nextLine();
                System.out.print("Subjects taught :");
                String sub=sc.nextLine();
                teachers[i]=new Teacher(empid,name,salary,address,dept,sub);


            }
            System.out.println("\n Details of all teachers:");
            for(Teacher teacher:teachers)
                teacher.display();
        
    }
}