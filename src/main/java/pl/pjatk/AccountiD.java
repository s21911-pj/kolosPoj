package pl.pjatk;

import javax.validation.Payload;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD) //
//@Constraint(validatedBy = AccountiD.class)

public @interface AccountiD {
    public int iD() default 0;

    String message() default "Wrong price";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}




