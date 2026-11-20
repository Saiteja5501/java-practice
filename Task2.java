class Product{
    private String pname;
    private double price;
    private int quantity;
    private String category;
    
    Product(String pname,double price,int quantity,String category){
        this.pname=pname;
        this.price=price;
        this.quantity=quantity;
        this.category=category;
    }
    public String getName(){
        return pname;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    public String getCategory(){
        return category;
    }
}
public class Task2 {
    public static void main(String[] args){
        Product p1 = new Product("Samsung Phone",15000,8,"Electronics");
        Product p2 = new Product("iPhone Cover",800,25,"Accessories");
        Product p3 = new Product("Bluetooth Headphone",1500,6,"Electronics");
        Product p4 = new Product("Phone Charger",600,15,"Accessories");
        Product p5 = new Product("Laptop",45000,4,"Computers");
        Product[] p={p1,p2,p3,p4,p5};
        productDetails(p);
    }
    static void productDetails(Product[] p){
        for(int i=0;i<p.length;i++){
                System.out.println(p[i].getName());
                System.out.println(p[i].getPrice());
                System.out.println(p[i].getQuantity());
                System.out.println(p[i].getCategory());
                System.out.println("ss............ss");
        }
        for(int i=0;i<p.length-1-i;i++){
            for(int j=0;j<p.length-1;j++){
                if(p[j].getPrice()<p[j+1].getPrice()){
                    Product temp=p[j];
                    p[j]=p[j+1];
                    p[j+1]=temp;
                }
            }
        }
        for(int i=0;i<p.length;i++){
            if(p[i].getPrice()>=500 && p[i].getPrice()<=2000){
                System.out.println(p[i].getName());
                System.out.println(p[i].getPrice());
                System.out.println(p[i].getQuantity());
                System.out.println(p[i].getCategory());
                System.out.println("pp............pp");
            }
        }
        String str="phone";
        for(int i=0;i<p.length;i++){
            if(p[i].getName().toLowerCase().contains(str.toLowerCase())){
                System.out.println(p[i].getName());
                System.out.println(p[i].getPrice());
                System.out.println(p[i].getQuantity());
                System.out.println(p[i].getCategory());
                System.out.println("tt............tt");
            }
        }
        for(int i=0;i<p.length;i++){
            if(p[i].getQuantity()<10){
                System.out.println(p[i].getName());
                System.out.println(p[i].getPrice());
                System.out.println(p[i].getQuantity());
                System.out.println(p[i].getCategory());
                System.out.println("ee............ee");
            }
        }
    }
}
