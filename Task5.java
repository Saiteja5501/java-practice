class Mobile{
    private String brand;
    private String model;
    private double price;
    private int ram;

    Mobile(String brand,String model,double price,int ram){
        this.brand=brand;
        this.model=model;
        this.price=price;
        this.ram=ram;
    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public double getPrice(){
        return price;
    }
    public int getRam(){
        return ram;
    }
}
public class Task5 {
  public static void main(String[] args){
    Mobile m1 = new Mobile("Samsung", "Galaxy S24", 65000, 8);
    Mobile m2 = new Mobile("Vivo", "V30", 28000, 12);
    Mobile m3 = new Mobile("Samsung", "Galaxy A15", 18000, 6);
    Mobile m4 = new Mobile("Motorola", "Edge 50", 22000, 8);
    Mobile m5 = new Mobile("iQOO", "Neo 9", 35000, 12);

    Mobile[] m={m1,m2,m3,m4,m5};
    mobileDetails(m);
  }  
  static void mobileDetails(Mobile[] m){
    for(int i=0;i<m.length;i++){
        System.out.println(m[i].getBrand());
        System.out.println(m[i].getModel());
        System.out.println(m[i].getPrice());
        System.out.println(m[i].getRam());
        System.out.println("aaa............aaa");
    }
    for(int i=0;i<m.length-1;i++){
        for(int j=0;j<m.length-1-i;j++){
            if(m[j].getPrice()>m[i].getPrice()){
                Mobile temp=m[j];
                m[j]=m[j+1];
                m[j+1]=temp;
            }
        }
    }
    for(int i=0;i<m.length;i++){
        if(m[i].getRam()>=8){
            System.out.println(m[i].getBrand());
            System.out.println(m[i].getModel());
            System.out.println(m[i].getPrice());
            System.out.println(m[i].getRam());
            System.out.println("bbb............bbb");
        }
    }
    String str="samsung";
    for(int i=0;i<m.length;i++){
        if(m[i].getBrand().toLowerCase().contains(str.toLowerCase()) || m[i].getModel().toLowerCase().contains(str.toLowerCase())){
            System.out.println(m[i].getBrand());
            System.out.println(m[i].getModel());
            System.out.println(m[i].getPrice());
            System.out.println(m[i].getRam());
            System.out.println("ccc............ccc");
        }
    }
    for(int i=0;i<m.length;i++){
        if(m[i].getPrice()>=15000 && m[i].getPrice()<=30000){
            System.out.println(m[i].getBrand());
            System.out.println(m[i].getModel());
            System.out.println(m[i].getPrice());
            System.out.println(m[i].getRam());
            System.out.println("ddd............ddd");
        }
    }
  }
}
