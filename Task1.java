class Employee{
    private String name;
    private int age;
    private double salary;
    private String dept;

    Employee(String name, int age, double salary, String dept){
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.dept=dept;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getSalary(){
        return salary;
    }
    public String getDepartment(){
        return dept;
    }
}

public class Task1 {
    public static void main(String[] args){
        Employee emp1 = new Employee("sai",22,50000,"CSE");
        Employee emp2 = new Employee("teja",23,45000,"ECE");
        Employee emp3 = new Employee("vivek",22,29000,"IT");
        Employee emp4 = new Employee("kristan",22,30000,"EEE");
        Employee[] e={emp1,emp2,emp3,emp4};
        printDetails(e);
    }

        static void printDetails(Employee[] e){
            for(int i=0;i<e.length-1;i++){
                for(int j=0;j<e.length-1;j++){
                if(e[j].getSalary()>e[j+1].getSalary()){
                    Employee temp=e[j];
                    e[j]=e[j+1];
                    e[j+1]=temp;
                }
            }
        }
            for(int j=0;j<e.length;j++){
                if(e[j].getSalary()>40000){
                    System.out.println(e[j].getName());
                    System.out.println(e[j].getAge());
                    System.out.println(e[j].getSalary());
                    System.out.println(e[j].getDepartment());
                    System.out.println("................");
                }
            }
            String s="IT";
            for(int j=0;j<e.length;j++){
                if(e[j].getDepartment().contains(s)){
                    System.out.println(e[j].getName());
                    System.out.println(e[j].getAge());
                    System.out.println(e[j].getSalary());
                    System.out.println(e[j].getDepartment());
                    System.out.println("................");
                }
            }
            String str="an";
            for(int i=0;i<e.length;i++){
                if(e[i].getName().toLowerCase().contains(str.toLowerCase())){
                    System.out.println(e[i].getName());
                    System.out.println(e[i].getAge());
                    System.out.println(e[i].getSalary());
                    System.out.println(e[i].getDepartment());
                    System.out.println("................");
                }
            }
        }
    }
