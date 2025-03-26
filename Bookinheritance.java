import java.util.Scanner;
class Publisher{
    String name;
    public void getpublisherdetails(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter publisher name: ");
        name=sc.nextLine();
    }
}
class Book extends Publisher{
    String title;
    int year;
    public void getbookdetails(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter book title");
        title=sc.nextLine();
        System.out.print("Enter publication year :");
        year=sc.nextInt();
        sc.nextLine();
    }
    public void displaybookdetails(){
        System.out.println("\npublisher:"+name);
        System.out.println("Title:"+title);
        System.out.println("year of publication :"+year);

    }
}
class Literature extends Book{
    String gen;
    public void getliteraturedetails(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter generation:");
        gen=sc.nextLine();
    }
    public void displaybookdetails(){
        super.displaybookdetails();
        System.out.println("generation:"+gen);
    }
}
class Fiction extends Book{
    String theme;
    public void getfictiondetails(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter theme :");
        theme=sc.nextLine();
    }
    public void displaybookdetails(){
        super.displaybookdetails();
        System.out.println("theme :"+theme);
    }
}
public class Bookinheritance{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of literature books :");
        int numlitbooks=sc.nextInt();
        Literature[] litbooks=new Literature[numlitbooks];
        System.out.println("Enter details for literature books:");
        for(int i=0;i<numlitbooks;i++){
            litbooks[i]=new Literature();
            litbooks[i].getpublisherdetails();
            litbooks[i].getbookdetails();
            litbooks[i].getliteraturedetails();

        }
        System.out.print("Enter the number of fiction books:");
        int numficbooks=sc.nextInt();
        sc.nextLine();

        Fiction[] ficbooks=new Fiction[numficbooks];
        System.out.println("Enter details for fiction books:");
        for(int i=0;i<numficbooks;i++){
            ficbooks[i]=new Fiction();
            ficbooks[i].getpublisherdetails();
            ficbooks[i].getbookdetails();
            ficbooks[i].getfictiondetails();
        }
        System.out.print("\n Literature books :");
        for(Literature litbook : litbooks){
            litbook.displaybookdetails();
            System.out.println();
        }
        System.out.println("\nFiction books:");
        for(Fiction ficbook:ficbooks){
            ficbook.displaybookdetails();
            System.out.println();
        }
    }
}