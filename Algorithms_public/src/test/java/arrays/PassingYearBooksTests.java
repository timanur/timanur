/**
 * 
 */
package arrays;

import java.util.Arrays;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTimeout;
import static java.time.Duration.ofSeconds;
import static java.time.Duration.ofMillis;
import static java.time.Duration.ofNanos;
import static java.time.Duration.ofMinutes;

import core.utils.TestUtils;

/**
* ===========================================================================
* @author Timur Nurullaev (@timanur)
*
* https://github.com/timanur
*
* PassingYearBooksTests.java
*
* ===========================================================================
* Module Information:
*
* =========================================================================== 
*/
class PassingYearBooksTests extends TestUtils {

	PassingYearBooks yearBooks;
	
	@BeforeEach                                         
    void setUp() {
		yearBooks = new PassingYearBooks();
	}
	
	/**
	 * Test method for {@link arrays.PassingYearBooks#printIntegerArray(int[])}.
	 */
	@Test
	void testPrintIntegerArray() {
		int[] arr_1 = {2, 1};
		int[] expected_1 = {2, 2};
		int[] output_1 = yearBooks.findSignatureCounts(arr_1);
		check(expected_1, output_1);

		int[] arr_2 = {1, 2};
		int[] expected_2 = {1, 1};
		int[] output_2 = yearBooks.findSignatureCounts(arr_2);
		check(expected_2, output_2);

		// Add your own test cases here
		int[] arr_3 = {1, 7, 2, 3, 4, 5};
		int[] expected_3 = {1, 2, 2, 2, 2, 2};
		int[] output_3 = yearBooks.findSignatureCounts(arr_3);
		check(expected_3, output_3);

		System.out.println(Arrays.toString(output_3));
		//System.out.println(System.getProperty("os.name"));
		//Assumptions.assumeFalse(System.getProperty("os.name").contains("Linux"));
	}
	
	@Test
	void timeoutNotExceeded() {
		
		int[] arr_3 = {1, 7, 2, 3, 4, 5};
	    assertTimeout(ofMillis(220), () -> yearBooks.findSignatureCounts(arr_3));
	}

}
