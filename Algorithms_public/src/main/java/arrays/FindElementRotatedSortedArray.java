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
 * FindElementRotatedSortedArray.java
 *
 * ===========================================================================
 * Module Information: LeetCode #33
 * 
 * There is an integer array nums sorted in ascending order (with distinct values).
 * Prior to being passed to your function, nums is possibly rotated at an 
 * unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). 
 * For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
 * Given the array nums after the possible rotation and an integer target, 
 * return the index of target if it is in nums, or -1 if it is not in nums.
 * You must write an algorithm with O(log n) runtime complexity.
 * Example 1:
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 * =========================================================================== 
 */

public class FindElementRotatedSortedArray {

	/**
	 * Binary search possibly rotated sorted int array with distinct elements
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public int search(int[] nums, int target) {
		//First find the pivot index
		int pivotIndex = findPivotIndex(nums);

		if(pivotIndex != -1 && nums[pivotIndex] == target) {
			return pivotIndex;
		}

		int start = 0;
		int end = nums.length -1;

		if(pivotIndex != -1) {
			//Search the left side of the pivot index
			if(target >= nums[start] && target <= nums[pivotIndex - 1]) {
				end = pivotIndex - 1;
				//Else search the right side of the pivot index	
			}else {
				start = pivotIndex + 1;
			}
		}
		return binarySearch(nums, start, end, target);
	}
	/**
	 * Perform binary search
	 * @param nums
	 * @param start
	 * @param end
	 * @param target
	 * @return
	 */
	public int binarySearch(int[] nums, int start, int end, int target) {
		while(start <= end) {
			int mid = (start + end) / 2;
			if(nums[mid] == target) {
				return mid;
			}else if(nums[mid] < target) {
				start = mid + 1;
			}else {
				end = mid - 1;
			}
		}
		return -1;
	}
	/**
	 * First find the pivot index, where next element is less than 
	 * the previous element in a ascending sorted array.
	 * 
	 * @param nums int[]
	 * @return int pivot
	 */
	public int findPivotIndex(int[] nums) {
		int start = 0;
		int end = nums.length - 1;
		if(end != 0) {
			while(start <= end){
				int mid = (start+end)/2;
				if(nums[mid] > nums[mid+1]) {
					return mid+1;
				}else if(mid > 0 && nums[mid-1] > nums[mid]) {
					return mid;
				}else if(nums[mid] > nums[end]) {
					start = mid + 1;
					//Only interested in subarray with a pivot
					//where mid element (subarray start) is larger
					//than the end element of the subarray
					//so don't look past mid element to the right
				}else {
					end = mid - 1;
				}
			}
		}
		return -1;   
	}
}
