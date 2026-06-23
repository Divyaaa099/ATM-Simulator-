import java.util.Scanner;
public class Atm_Simu{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        Double total=(double) 0;
        int pin=1234;

        System.out.println("----------ATM SIMULATOR----------------------------");
        int attempts=0;

        while(attempts<3){
            System.out.println("Enter PIN: ");
            int userPin=sc.nextInt();
            if(userPin==pin){
                System.out.println("Login Successful!");
                System.out.println();
                break;
            }
            else{
                attempts++;
                System.out.println("WRONG PIN!,Try Again");
                System.out.println();
                if(attempts<3){
                    System.out.println("Attempts left: "+(3-attempts));
                    System.out.println();
                }
            }
        }
        if(attempts==3){
            System.out.println("card Blocked");
            System.out.println("Too many Incorrect attempts:");
            System.out.println();
            return;
        }

        while(true){
            System.out.println("Enter your choice: \n1.Deposite \n2.Withdraw\n3.Check Balance\n4.Exit");
            int choice=sc.nextInt();
            System.out.println();

            switch(choice){
                case 1:
                    System.out.println("Enter the amount you want to Deposite: ");
                    double amount=sc.nextDouble();
                    total+=amount;
                    System.out.println("Depositedd!!! and Current Balance : "+total);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Enter the amount you want to Withdraw: ");
                    double withdrawal_amt=sc.nextDouble();
                    if(withdrawal_amt<=total){
                    total-=withdrawal_amt;
                    System.out.println("Withdrawal Successfull! and Remining Balance: "+total);
                    System.out.println();
                    }else{
                        System.out.println("Insufficient Balance!");
                        System.out.println();
                    }
                    break;
                case 3 :
                    System.out.println("Total Balance: "+total);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("EXIT!!");
                    System.out.println();
                    return;
                default:
                    System.out.println("Invalid choice!!!");
                    break;
            }
        }
    }
}
