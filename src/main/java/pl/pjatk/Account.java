package pl.pjatk;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;

@Setter
@Getter
@NoArgsConstructor

public class Account extends User {
    private float balance = 0;
    private int accountId;
    User user = new User ();

    public Account(int iD, String name, String surname, int balance, int accountId) {
        super (iD, name, surname);
        this.balance = balance;
        this.accountId = accountId;
        this.user.setName(name);
        this.user.setID (iD);
        this.user.setSurname (surname);
    }
    public Account(int balance, int accountId){
        this.accountId = accountId;
        this.balance = balance;


    }
}
