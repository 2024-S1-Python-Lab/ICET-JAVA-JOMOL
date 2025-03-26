interface BillCalc{
    double calculate(double quantity,double unitprice);
}
class Bill implements BillCalc{
    private int orderno;
    private String date;
    private String[][] items;
    Bill(int orderno,String date,String[][] items){
        this.orderno=orderno;
        this.date=date;
        this.items=items;
    }
    public double calculate(double quantity,double unitprice){
        return quantity*unitprice;
    }
    public void generatebill(){
        System.out.println("order no:"+orderno);
        System.out.println("date:"+date);
        System.out.println("Product id\tQuantity\tunit price\ttotal");
        double netamount=0.0;
        for(String[] item:items){
            int productid=Integer.parseInt(item[0]);
            String name=item[1];
            double quantity=Double.parseDouble(item[2]);
            double unitprice=Double.parseDouble(item[3]);
            double total=calculate(quantity,unitprice);
            netamount+=total;
            System.out.println(productid+"\t"+name+"\t"+quantity+"\t"+unitprice+"\t"+total);
        }
        System.out.println("\t\t\t\t\t\t net amount\t"+netamount);
    }
}
public class CO3Bill{
    public static void main(String[] args){
        int orderno=123;
        String date="2024-03-02";
        String[][] items={{"101","A","2","25"},{"102","B","1","100"}};
        Bill bill=new Bill(orderno,date,items);
        bill.generatebill();
    }
}