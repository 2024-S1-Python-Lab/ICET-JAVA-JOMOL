import java.util.Scanner;
public class Employee{
    int eno;
    String ename;
    double esalary;
    public void getdetails(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Employee number:");
        eno=sc.nextInt();
        System.out.print("Name :");
        sc.nextLine();
        ename=sc.nextLine();
        System.out.print("salary :");
        esalary=sc.nextDouble();

    }
    void display(){
        System.out.println("Employee no :"+eno);
        System.out.println("Employee name :"+ename);
        System.out.println("Employee salary :"+esalary+"\n");
    }
    public static void main(String[] args){
        System.out.println("\n Enter the no of employees");
        Scanner sc1=new Scanner(System.in);
         int num=sc1.nextInt();
         System.out.println("Enter the employee details");
         Employee arr[]=new Employee[num];
         for(int i=0;i<num;i++){
            arr[i]=new Employee();
            arr[i].getdetails();
         }
         System.out.println("Informations of all employees");
         for(int i=0;i<num;i++)
            arr[i].display();
        boolean state=false;
        System.out.println("Enter the employee number to get details of a employee:");
        int num2=sc1.nextInt();
        for(int i=0;i<num;i++){
            if(arr[i].eno==num2){
                System.out.println("Employee details");
                arr[i].display();
            }
        }
    }
}