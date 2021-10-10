/**
 * 
 */
package core.utils;

/**
* ===========================================================================
* @author Timur Nurullaev (@timanur)
*
* https://github.com/timanur
*
* TestUtils.java
*
* ===========================================================================
* Module Information:
*
* =========================================================================== 
*/
public class TestUtils {

	int test_case_number = 1;
	/**
	 * 
	 * @param expected
	 * @param output
	 */
	public void check(int[] expected, int[] output) {
		int expected_size = expected.length; 
		int output_size = output.length; 
		boolean result = true; 
		if (expected_size != output_size) {
			result = false;
		}
		for (int i = 0; i < Math.min(expected_size, output_size); i++) {
			result &= (output[i] == expected[i]);
		}
		char correctCheckMark = '\u2713';
		char incorrectCheckMark = '\u2717';
		if (result) {
			System.out.println(correctCheckMark + " Test :" + test_case_number);  
		}
		else {
			System.out.print(incorrectCheckMark + " Test :" + test_case_number + ": Expected ");
			printIntegerArray(expected); 
			System.out.print(" Output: ");
			printIntegerArray(output);
			System.out.println();
		}
		test_case_number++;
	}
	/**
	 * 
	 * @param arr
	 */
	public void printIntegerArray(int[] arr) {
		int len = arr.length; 
		System.out.print("[");
		for(int i = 0; i < len; i++) {
			if (i != 0) {
				System.out.print(", ");
			}
			System.out.print(arr[i]);
		}
		System.out.print("]");
	}
}
