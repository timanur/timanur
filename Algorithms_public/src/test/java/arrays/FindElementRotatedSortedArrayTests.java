/**
 * 
 */
package arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
* ===========================================================================
* @author Timur Nurullaev (@timanur)
*
* https://github.com/timanur
*
* FindElementRotatedSortedArrayTests.java
*
* ===========================================================================
* Module Information:
*
* =========================================================================== 
*/

public class FindElementRotatedSortedArrayTests {
	
	FindElementRotatedSortedArray findElementRotatedArr;
	
	@BeforeEach                                         
	void setUp() {
		findElementRotatedArr = new FindElementRotatedSortedArray();
	}
	
	@Test
	void testFirstEncounteredIndexArray() {
		//int[] nums = {5,6,7,8,9,10,11,12,14,15,0,1,2,3,4}; int target = 2;
		//Output: 12
		int[] nums = {1,3}; int target = 3;
		//Output: 1
		//int[] nums = {4,5,6,7,0,1,2}; int target = 2;
		//Output: 6
		//int[] nums = {4,5,6,7,0,1,2}; int target = 7;
		//Output: 3
		//int[] nums = {5,1,3}; int target = 5;
		//Output: 0
		//int[] nums = {5,1,2,3,4}; int target = 1;
		//Output: 1
		//int[] nums = {1}; int target = 1;
		//Output: 1
		//int[] nums = {6,7,8,1,2,3,4,5}; int target = 6;
		//Output: 0
				
		int el = findElementRotatedArr.search(nums, target);
		
		System.out.println(el);
	}
}
