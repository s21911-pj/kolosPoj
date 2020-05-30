package pl.pjatk;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;

import java.math.BigDecimal;

@Setter
@Getter
@NoArgsConstructor

public class Account extends User {
    private float balance = 0;
    private String numberAccount;
    @AccountiD
    private int accountId;
    private BigDecimal balanceAccount = new BigDecimal ("0");
    User user = new User ();

    public Account(int iD, String name, String surname, int balance, int accountId) {
        super (iD, name, surname);
        this.balance = balance;

        this.accountId = accountId;
        this.user.setName (name);
        this.user.setID (iD);
        this.user.setSurname (surname);
    }

    public Account(int balance, int accountId) {
        this.accountId = accountId;
        this.balance = balance;


    }

    public void setBalanceAccount(double many) {
        balanceAccount = balanceAccount.add (BigDecimal.valueOf (many));
    }

    public void accountBalance() {
        System.out.println ("account balance " + balanceAccount);
    }
}
