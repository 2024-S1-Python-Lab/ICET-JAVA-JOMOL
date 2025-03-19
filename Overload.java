import java.util.Scanner;
public class Overload{
    void area(double r){
        double Ar=3.14*r*r;
        System.out.println("Area of circle ="+Ar);

    }
    void area(int len,int br){
        int Ar=len*br;
        System.out.println("Area of rectangle ="+Ar);
    }
    void area(int l,int b,int h){
        int Ar=l*b*h;
        System.out.println("Area of cuboid ="+Ar);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Overload obj1=new Overload();
        System.out.println("Enter the radius");
        int r=sc.nextInt();
        obj1.area(r);
        System.out.println("Enter the length & breadth");
        int len=sc.nextInt();
        int br=sc.nextInt();
        obj1.area(len,br);
        System.out.println("Enter the length,Breadth & height");
        int l=sc.nextInt();
        int b=sc.nextInt();
        int h=sc.nextInt();
        obj1.area(l,b,h);
        
    }
}