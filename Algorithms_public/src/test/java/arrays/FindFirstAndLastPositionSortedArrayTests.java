/**
 * 
 */
package arrays;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * ===========================================================================
 * @author Timur Nurullaev (@timanur)
 *
 * https://github.com/timanur
 *
 * FindFirstAndLastPositionSortedArrayTests.java
 *
 * ===========================================================================
 * Module Information:
 *
 * =========================================================================== 
 */

public class FindFirstAndLastPositionSortedArrayTests {

	FindFirstAndLastPositionSortedArray findPos;

	@BeforeEach                                         
	void setUp() {
		findPos = new FindFirstAndLastPositionSortedArray();
	}

	@Test
	void testFirstEncounteredIndexArray() {
		int[] nums = {1,2,3,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,9,10,12,15}; int target = 8;
		//Output: [3,19]

		//int[] nums = {5,7,7,8,8,10}; int target = 8;
		//Output: [3,4]

		//int[] nums = {5,7,7,8,8,10}; int target = 6;
		//Output: [-1,-1]

		//int[] nums = {}; int target = 0;
		//Output: [-1,-1]

		//int[] nums = {1}; int target = 1;
		//Output: [-1,-1]

		System.out.println("length -> " + nums.length);
		int lIndex = findPos.findLeftIndex(nums, target);
		System.out.println(lIndex);
		int rIndex = findPos.findRightIndex(nums, target);
		System.out.println(rIndex);
		System.out.println(Arrays.toString(findPos.searchRange(nums, target)));

	}
}
