/**
 * 
 */
package org.mai.type;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * @author Sudhin Varghese
 *
 */
@Retention(RUNTIME)
@Target({TYPE})
public @interface FixedWidthEntity {

}
