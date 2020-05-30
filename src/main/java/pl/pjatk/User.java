package pl.pjatk;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class User {
    private int iD;
    private String name;
    private String surname;
}
