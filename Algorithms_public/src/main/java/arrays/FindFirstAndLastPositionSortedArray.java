/**
 * 
 */
package arrays;

/**
 * ===========================================================================
 * @author Timur Nurullaev (@timanur)
 *
 * https://github.com/timanur
 *
 * FindFirstAndLastPositionSortedArray.java
 *
 * ===========================================================================
 * Module Information: Leetcode # 34
 * 
 * Given an array of integers nums sorted in ascending order,
 * find the starting and ending position of a given target value.
 * 
 * If target is not found in the array, return [-1, -1].
 * You must write an algorithm with O(log n) runtime complexity.

 * Example 1:
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]

 * Example 2:
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]

 * Example 3:
 * Input: nums = [], target = 0
 * Output: [-1,-1]
 * =========================================================================== 
 */

public class FindFirstAndLastPositionSortedArray {

	/**
	 * Using binary search ( O(log N) time complexity ) find first and last positions
	 * of the given target element 
	 *  
	 * @param nums int[]
	 * @param target int
	 * @return int[] array
	 */
	public int[] searchRange(int[] nums, int target) {
		int ret[] = {-1,-1};
		int lIndex = findLeftIndex(nums, target);
		int rIndex = findRightIndex(nums, target);
		ret[0] = lIndex;
		ret[1] = rIndex;

		return ret;
	}

	/**
	 * Using binary search find leftmost index 
	 */
	public int findLeftIndex(int[] nums, int target){
		int start = 0;
		int end = nums.length - 1;
		int ret = -1;
		
		while(start <= end){
			int mid = (start+end) / 2;
			if(nums[mid] == target){
				ret = mid;
			}
			if(nums[mid] < target){
				start = mid + 1;
			}else {
				end = mid -1;
			}
		}
		return ret;
	}
	/**
	 * Using binary search find rightmost index
	 */
	public int findRightIndex(int[] nums, int target){
		int start = 0;
		int end = nums.length - 1;
		int ret = -1;
		
		while(start <= end){
			int mid = (start+end) / 2;
			if(nums[mid] == target){
				ret = mid;
			}
			if(nums[mid] > target){
				end = mid - 1;
			}else {
				start = mid + 1;
			}
		}
		return ret;
	}

}
