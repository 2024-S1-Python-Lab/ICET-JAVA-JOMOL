import java.util.Scanner;
interface Shape{
    void getdata();
    void area();
    void perimeter();
}
class Circle implements Shape{
    double pi=3.14;
    double r;
    Scanner sc=new Scanner(System.in);
    public void getdata(){
        System.out.println("Enter the radius of the circle");
        r=sc.nextDouble();
    }
    public void perimeter(){
        System.out.println("perimeter of the circle:"+(2*pi*r));
    }
    public void area(){
        System.out.println("area of the circle:"+(pi*r*r));
    }
}
class Rectangle implements Shape{
    double l,b;
    Scanner sc=new Scanner(System.in);
    public void getdata(){
        System.out.println("Enter the length of the rectangle:");
        l=sc.nextDouble();
        System.out.println("Enter the breadth of the rectangle:");
        b=sc.nextDouble();
    }
    public void area(){
        System.out.println("Perimeter of a rectangle:"+(l*b));
    }
    public void perimeter(){
        System.out.println("Perimeter of a rectangle:"+(2+(l+b)));
    }
}
public class CO3Interface{
    public static void main(String[] args){
        int ch;
        Scanner sc=new Scanner(System.in);
        Circle ob1=new Circle();
        Rectangle ob2=new Rectangle();
        do{
            System.out.println("\n1.circle\n2.rectangle\n3.exit");
            System.out.println("Enter your choice:");
            ch=sc.nextInt();
            switch(ch){
                case 1:ob1.getdata();
                       ob1.area();
                       ob1.perimeter();
                       break;
                case 2:ob2.getdata();
                       ob2.area();
                       ob2.perimeter();
                       break;
                case 3:System.out.println("Exited.....");
                       System.exit(0);
            }
        }while (true);
    }
}