/**
 * 
 */
package org.mai.type;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * @author Sudhin Varghese
 *
 */
@Retention(RUNTIME)
@Target({METHOD, FIELD})
public @interface FixedWidthColumn {
	
	int index();
	
	int size();

}
