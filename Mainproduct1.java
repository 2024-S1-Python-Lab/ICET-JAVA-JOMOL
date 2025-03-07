class Product{
    int pcode;
    String pname;
    int pprice;
    Product(int code,String name,int price){
        pcode=code;
        pname=name;
        pprice=price;
    }
    void display(){
        System.out.println("Product code : "+pcode);
        System.out.println("Product name : "+pname);
        System.out.println("Product price : "+pprice);


    }
}
    class Mainproduct1{
        public static void main(String args[]){
            Product obj1=new Product(123,"pen",10);
            Product obj2=new Product(423,"pensil",5);
            Product obj3=new Product(233,"book",30);
            System.out.println("Product with lowest price");
            if(obj1.pprice<obj2.pprice){
                if(obj1.pprice<obj3.pprice){
                    obj1.display();
                }
                else{
                    obj3.display();
                }
            }
            else if(obj3.pprice<obj2.pprice){
                obj3.display();
            }
            else{
                obj2.display();
            }

        }
    }

