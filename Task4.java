class BankAccount{
    private String accountHolder;
    private long accountNumber;
    private double balance;
    private String accountType;

    BankAccount(String accountHolder,long accountNumber,double balance,String accountType){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.accountType=accountType;
    }
    public String getName(){
        return accountHolder;
    }
    public long getNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public String getType(){
        return accountType;
    }
}
public class Task4 {
    public static void main(String[] args){
        BankAccount b1=new BankAccount("Ravi", 1001001L, 75000, "Savings");
        BankAccount b2 = new BankAccount("Kiran", 1001002L, 25000, "Current");
        BankAccount b3 = new BankAccount("Prakash", 1001003L, 95000, "Savings");
        BankAccount b4 = new BankAccount("Arun", 1001004L, 45000, "Current");
        BankAccount b5 = new BankAccount("Rahul", 1001005L, 60000, "Savings");

        BankAccount[] b = {b1, b2, b3, b4, b5};
        bankDetails(b);
    }
    static void bankDetails(BankAccount[] b){
        for(int i=0;i<b.length;i++){
            System.out.println(b[i].getName());
            System.out.println(b[i].getNumber());
            System.out.println(b[i].getBalance());
            System.out.println(b[i].getType());
            System.out.println("aaa.........aaa");
        }
        for(int i=0;i<b.length-1;i++){
            for(int j=0;j<b.length-1-i;j++){
                if(b[j].getBalance()>b[j+1].getBalance()){
                    BankAccount temp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp;
                }
            }
        }
        for(int i=0;i<b.length;i++){
            if(b[i].getBalance()>50000){
                System.out.println(b[i].getName());
                System.out.println(b[i].getNumber());
                System.out.println(b[i].getBalance());
                System.out.println(b[i].getType());
                System.out.println("bbb.........bbb");
            }
        }
        String str="ra";
        for(int i=0;i<b.length;i++){
            if(b[i].getName().toLowerCase().contains(str.toLowerCase())){
                System.out.println(b[i].getName());
                System.out.println(b[i].getNumber());
                System.out.println(b[i].getBalance());
                System.out.println(b[i].getType());
                System.out.println("ccc.........ccc");
            }
        }
        String s="savings";
        for(int i=0;i<b.length;i++){
            if(b[i].getType().toLowerCase().contains(s.toLowerCase())){
                System.out.println(b[i].getName());
                System.out.println(b[i].getNumber());
                System.out.println(b[i].getBalance());
                System.out.println(b[i].getType());
                System.out.println("ddd.........ddd");
            }
        }
    }
}
