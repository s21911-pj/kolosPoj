package pl.pjatk;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor


public class Bank {
    private int bankId;
    private String nameBank;
    private List<Account> accountList = new ArrayList<> ();
}
