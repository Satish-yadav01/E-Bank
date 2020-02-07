import static java.lang.System.exit;
import java.util.*;

interface details
{   
    public void addBankAccount();
    public void removeBnankAccount();
    public void depositeMoney();
    public void widthrawMoney();
    public void showBalance();
    public void showDetails();
    public void showHistory();
}
class Employee implements details
{
    double tran_history[]=new double[100];
    long acc_no,mob_no;
    String name,type;
    int age,i;
    double balance;
    @Override
    public void addBankAccount(){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter your Account Number:");
         acc_no=sc.nextLong();
         System.out.println("Enter Account Holder Name:");
         name=sc.next();
         System.out.println("Which type of Account you want [s/c]");
         type=sc.next();
         System.out.println("Enter mobile namuber");
         mob_no=sc.nextLong();
         System.out.println("Enter your age");
         age=sc.nextInt();
    }
    @Override
    public void removeBnankAccount(){
        System.out.println("\nIf you want to remove your Account then probabily you lost your ammount that are stored in SATISH-EBank");
        System.out.println("\nKindly request to the user first you have to widthdraw your money!!!\nThank You.");
        System.out.println("Do you really want to continue:[Y/N]");
        Scanner sc;
        sc = new Scanner(System.in);
        String option=sc.next();
        if("Y".equals(option) || "y".equals(option)){
            acc_no=0;
            mob_no=0;
            name="NA";
            type="NA";
            System.out.println("your account will be removed");
        }
        
    }
    @Override
    public void depositeMoney(){
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("How much you want to deposite:");
        double depositableAmount=sc.nextDouble();
        balance=depositableAmount;
        System.out.println("you deposited "+depositableAmount+" in your Account");
        tran_history[i]=depositableAmount;
        i++;
    }
    @Override
    public void widthrawMoney(){
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("\nHow much you want to widthdraw: ");
        double widthrawalAmount =sc.nextDouble();
        double transection=widthrawalAmount;
        if(balance < widthrawalAmount)
        {
            System.out.println("Insufficient Balance!!!!");
        }
        balance=balance - widthrawalAmount;
        System.out.println("you widthdraw "+widthrawalAmount+" from your Account");
        System.out.println("Your current Balance is: "+balance);
        tran_history[i]= -transection;
        i++;
    }
    @Override
    public void showBalance(){
        System.out.println("your current balance is:"+balance);
    }
    @Override
    public void showDetails(){
        System.out.println("\n==========Your Details============ ");
        System.out.println("your Account Number:"+acc_no);
        System.out.println("Account Holder Name:"+name);
        System.out.println("type of Account is:"+type);
        System.out.println("mobile namuber is:"+mob_no);
        System.out.println("your age is:"+age);
        
    }
    @Override
    public void showHistory()
    {
        System.out.println("-------------TRANSECTION HISTORY------------");
        for(int j=0;j<i;j++)
        {
            System.out.println(j+"th transection :"+tran_history[j]);
        }
    }
    
}
public class Account {
    public static void main(String []args)
    {
        String ans;
        Employee e=new Employee();
        System.out.println("--------------------------SATISH-EBANK----------------------------\n");
        do{
            System.out.println("1)ADD ACCOUNT\n2)DELETE ACCOUNT\n3)SHOW DETAILS\n4)SHOW BALANCE\n5)DEPOSITE MONEY\n6)WIDTHDRAW MONEY\n7)SHOW HISTORY\n =>");
            System.out.println("Choose your option:");
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            switch(n){
                case 1:
                    e.addBankAccount();
                    break;
                case 2:
                    e.removeBnankAccount();
                    System.exit(0);
                case 3:
                    e.showDetails();
                    break;
                case 4:
                    e.showBalance();
                    break;
                case 5:
                    e.depositeMoney();
                    break;
                case 6:
                    e.widthrawMoney();
                    break;
                case 7:
                    e.showHistory();
                    break;
                default:
                    System.out.println("choose a valid input:");
            }
            System.out.println("Do you want to continue:[Y/N]");
            ans=sc.next();
        }while(!"N".equals(ans) ||!"n".equals(ans));
        
    }
}
