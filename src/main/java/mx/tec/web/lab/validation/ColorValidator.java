/**
 * 
 */
package mx.tec.web.lab.validation;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Class that validates the Color of a Product.
 * Valid colors: black, red, blue, yellow, green, white
 * @author Cesar
 *
 */
public class ColorValidator implements ConstraintValidator<ValidColor, String>{
	private final List<String> validColors = Arrays.asList("black", "red", "blue", "yellow", "green", "white");

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		return validColors.contains(value);
	}
}
