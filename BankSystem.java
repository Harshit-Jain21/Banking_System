import java.util.*;

public class BankSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter you account number:");
        String accno=sc.nextLine();
        System.out.println("Enter your EMAIL:");
        String email= sc.nextLine();
        System.out.println("Enter the total amount:");
        long amount = sc.nextLong();
        System.out.println("Enter your PIN:");
        long PIN = sc.nextLong();

        int ch;
        String choice;
        Bank bs =new Bank();
        do {
            System.out.println("Name:"+name);
            System.out.println("Press 1 to Check Bank Balance");
            System.out.println("Press 2 to Withdraw Money");
            System.out.println("Press 3 to Deposit Money");
            System.out.println("Press 4 for account Details");
            ch=sc.nextInt();
            if (ch==1) {
                bs.totalamount(amount);
            }
            else if (ch==2) {
                System.out.println("Enter the amount you want to withdraw");
                long with = sc.nextLong();
                System.out.println("Enter your PIN to Wthdraw Money");
                long pincheck= sc.nextLong();
                if (PIN==pincheck) {
                    amount = bs.withdraw(with,amount);
                }
                else{
                    System.out.println("incorrect PIN");
                }
                
            }
            else if (ch==3) {
                System.out.println("Enter the amount you want to deposit");
                long depo = sc.nextLong();
                amount = bs.deposit(depo,amount);
            }
            else if (ch==4) {
                System.out.println("All Details");
                bs.detail(name,accno,amount,email);
            }
            else{
                System.out.println("wrong choice");
            }
            sc.nextLine();
            System.out.println("Enter Y/y to repeat or N/n to stop");
            choice = sc.nextLine();
        } while (choice.equals("y") || choice.equals("Y"));
        sc.close();
    }
}
class Bank{
    public long withdraw(long with1, long total){
        total = total-with1;
        System.out.println("Amount withdrawn succesfully");
        return total;
    }
    public void totalamount(long tota){
        System.out.println("Bank Balance = "+tota);
    }
    public long deposit(long depos,long total){
        total=total+depos;
        System.out.println("Amount Deposit succesfull");
        return total;
    }
    public void detail(String name, String accno, long balance ,String email){
        System.out.println("Bank account name = IDFC FIRST BANK");
        System.out.println("Name of account holder: " + name);  
        System.out.println("Eamil id: " + email);  
        System.out.println("Account no.: " + accno);  
        System.out.println("Balance: " + balance);
    }
}


