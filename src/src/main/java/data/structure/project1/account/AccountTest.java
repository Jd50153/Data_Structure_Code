package data.structure.project1.account;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account("Julian");
        boolean stateDrawOutMoney;
        account.depositMoney("123456" , 2000 , 1);
        account.getInfoAccoun();
        account.depositMoney("123456" , 3000 , 2);
        account.getInfoAccoun();
        stateDrawOutMoney = account.drawOutMoney("123456" , 1000,"9025");
        if (stateDrawOutMoney){
            account.getInfoAccoun();
        }


    }
}
