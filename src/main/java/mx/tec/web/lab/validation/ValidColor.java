/**
 * 
 */
package mx.tec.web.lab.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * Constraint that validates the Color field of the Product.
 * @author Cesar
 *
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD })
@Constraint(validatedBy = ColorValidator.class)
public @interface ValidColor {
	/**
	 * Message that will be displayed
	 * @return If there was no message provided, "Invalid color"
	 */
	String message() default "Invalid color";
	
	/**
	 * Groups
	 * @return If there was no group provided, {}
	 */
	Class<?>[] groups() default {};
	
	/**
	 * Payload
	 * @return If there was no payload provided, {}
	 */
	Class<? extends Payload>[] payload() default {};

}
