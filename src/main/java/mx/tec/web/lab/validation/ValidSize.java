package mx.tec.web.lab.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD })
@Constraint(validatedBy = SizeValidator.class)
public @interface ValidSize {
	String message() default "Invalid size";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
