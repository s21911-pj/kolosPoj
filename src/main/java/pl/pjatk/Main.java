package pl.pjatk;

public class Main {
    public static void main(String[] args) {
        User user = new User (1,"Peter","Mastalerz");
        Account account = new Account (1,"Peter","Mastalerz",2000,1);
        Account account1 = new Account (2000,2);
        Account account2 = new Account (2,"Pawel","Mastalerz",1500,2);


        System.out.println (account1.getBalance ());
        System.out.println (account1.getAccountId ());

        System.out.println (account2.getName ());
        System.out.println (account2.getBalance ());


        System.out.println (account.getSurname ());



        account1.setBalanceAccount (100);
        account1.setBalanceAccount (250);
        account1.setBalanceAccount (400);
        account1.setBalanceAccount (500);
        account1.accountBalance();

    }
}
