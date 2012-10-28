/**
 * 
 */
package org.mai.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.mai.parser.FixedWidthParser;

/**
 * @author sudhin
 * 
 */
public class EmployeeParserTest {

	@Test
	public void testIfInstanceIsCreated() throws InstantiationException, IllegalAccessException {

		Employee employee = new FixedWidthParser<Employee>().parse(Employee.class, null);
		assertNotNull(employee);

	}

}
