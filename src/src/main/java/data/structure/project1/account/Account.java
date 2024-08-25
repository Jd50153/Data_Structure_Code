package data.structure.project1.account;
import java.util.Objects;

public class Account {
    private String account_number = "123456";
    private double balance;
    private String nameUser;
    private String keyAccount = "9025";

    public Account(String nameUser){
        this.nameUser = nameUser;
    }

    public void depositMoney(String account , double money , int numberDeposit){
        if(Objects.equals(account, account_number)){
            if (money > 0) {
                balance += money;
                System.out.println("successful deposit " + numberDeposit);
            } else {
                System.out.println("Deposit amount must be positive.");
            }
        }else{
            System.out.println("Account number does not exist  , try with another account number");
        }
    }

    public boolean drawOutMoney(String account , double money , String key){
        boolean stateDrawout = false;
        if(Objects.equals(account, account_number) && Objects.equals(keyAccount, key)  ){
            double totalBalance = balance - money;
            if (money > 0 && totalBalance > 0) {
                balance -= money;
                System.out.println("Successful retreat");
                stateDrawout = true;
            } else {
                if (money < 0){
                    System.out.println("Withdraw a positive amount");

                }else{
                    System.out.println("Failed retreat , your account woudn´t empty");

                }
            }
        }else{
            if(!Objects.equals(account, account_number)){
                System.out.println("Account number does not exist  , try with another account number");

            }else{
                System.out.println("It's not your password, try again");

            }
        }
        return  stateDrawout;
    }

    public double getBalance(){
        return balance;
    }

    public void getInfoAccoun(){
        System.out.println("The account holder is " + nameUser + " and your account balance is " + getBalance());
    }

}
