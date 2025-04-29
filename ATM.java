import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ATM {

    private double balance;


    public interface AtmOperationInterface{
         void viewBalance();
         void withdrawAmount(double withdrawAmount);
         void depositAmount(double depositAmount);
         void viewMiniStatement();
    }
    // Default constructor
    public ATM(){

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static class AtmOperationImpl implements AtmOperationInterface {
        ATM atm = new ATM();

        Map<Double, String> miniStatement = new HashMap<>();

        @Override
        public void viewBalance() {
            System.out.println(" Available Balance is : " + atm.getBalance());
            System.out.println();
        }

        @Override
        public void withdrawAmount(double withdrawAmount) {
            if (withdrawAmount % 500 == 0) {
                if (withdrawAmount <= atm.getBalance()) {
                    miniStatement.put(withdrawAmount, "Amount Withdrawn");
                    System.out.println(" Collect the amount :" + withdrawAmount);
                    atm.setBalance(atm.getBalance() - withdrawAmount);
                    viewBalance();
                } else
                    System.out.println(" Insufficient Balance ");
            }
            else
                System.out.println(" Please Enter the amount in the multiple of 500");
        }

        @Override
        public void depositAmount(double depositAmount) {
            miniStatement.put(depositAmount, "Amount Deposited");
            System.out.println(" "+depositAmount + " Deposited Successfully");
            atm.setBalance(atm.getBalance() + depositAmount);
            viewBalance();
            System.out.println();
        }

        @Override
        public void viewMiniStatement() {
            for (Map.Entry<Double, String> m : miniStatement.entrySet()) {
                System.out.println(" "+m.getKey() + " -> " + m.getValue());
            }
            viewBalance();
        }
    }

    public static void main(String[] args) {
        AtmOperationInterface op = new AtmOperationImpl();
        int atmNumber = 12345;
        int AtmPin = 123;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ATM Machine");
        System.out.print("Enter Your_ATM_Number : ");
        int atm_Number = sc.nextInt();
        System.out.print("Enter Your_ATM_Pin : ");
        int pin = sc.nextInt();

        if(atmNumber==atm_Number && AtmPin==pin){
            System.out.println("Successful Validation !!!");
            System.out.println();
            while (true){
                System.out.println("Select An Option -->>");
                System.out.println("1.View Available Balance\n2.Withdrawn Amount\n3.Deposit Amount\n4.View The Mini_Statement\n5.Exit");
                System.out.print("Enter the Choice :  ");
                int ch = sc.nextInt();
                if(ch==1){
                   op.viewBalance();
                }
                else if (ch==2) {
                    System.out.print("Enter Amount To Withdrawn : ");
                    double withdrawAmount = sc.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                }
                else if (ch==3) {
                    System.out.print("Enter Amount To Deposit : ");
                    double depositAmount = sc.nextDouble();
                    op.depositAmount(depositAmount);
                }
                else if (ch==4) {
                 op.viewMiniStatement();
                }
                else if(ch==5) {
                    System.out.println("Collect Your Atm Card");
                    System.out.println("Thank You For Using For Atm Machine");
                    System.exit(0);
                }
                else
                    System.out.println("Please Enter The Correct Choice !");
            }
        }
        else {
            System.out.println("Incorrect AtmNumber or Pin");
            System.exit(0);
        }
    }
}
