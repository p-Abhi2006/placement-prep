package javacore.day10;
public class BankAccount {
    String name;
    double balance;
    static int count=0;
    BankAccount(String name,double balance){
        this.name=name;
        this.balance=balance;
        count++;
    }
    void displayDetails(){
        System.out.println("Name:"+name);
        System.out.println("Balance:"+balance);
        System.out.println("Count:"+count);
    }
}
 class Main{
    public static void main(String[] args) {
        BankAccount b=new BankAccount("Abhi",2000);
        BankAccount b1= new BankAccount("Abhi",2500);
        b.displayDetails();;
        b1.displayDetails();
    }
}
