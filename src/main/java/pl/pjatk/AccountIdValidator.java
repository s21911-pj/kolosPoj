package pl.pjatk;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AccountIdValidator implements ConstraintValidator<AccountiD, Integer> {

    @Override
    public void initialize(AccountiD constraintAnnotation) {

    }

    @Override
    public boolean isValid(Integer iD, ConstraintValidatorContext context) {
        System.out.println ("o cho nie wiem co");
        return iD  >= 150;
    }

}
