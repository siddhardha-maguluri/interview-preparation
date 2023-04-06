package leetcode;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

public class ArrayProductExceptSelf {
	
	/* a brute-force approach. I added all the numbers in nums array to Hashtable, with index  
	 * as key and number as value. After that i am iteration the array, during each iteration
	 * i am getting all the keys of a hashtable and if the key is not equal to index, then i 
	 * am calculating the product and storing the product in a new array at that index.
	 * 
	 * I guess this is incorrect use of hashtable. 
	 */
	public int[] productExceptSelf(int[] nums) {
		
		int[] answer = new int[nums.length];
		
		Hashtable<Integer, Integer> ht = new Hashtable<>();
		
		for(int i=0;i< nums.length; i++) {
			ht.put(i, nums[i]);
		}
		
		
		for(int i=0; i< nums.length; i++) {
			int product = 1;
			Enumeration<Integer> keys = ht.keys();
			while (keys.hasMoreElements()) {
	            Integer key = keys.nextElement();
	            if(key != i) {
	            	product *= nums[key];
	            }
	        }
			answer[i] = product;
		}    
		
		return answer;
    }

	public static void main(String[] args) {
		int nums[] = new int[] {1,2,3,4};
		ArrayProductExceptSelf ap = new ArrayProductExceptSelf();
		System.out.println(ap.productExceptSelf(nums));

	}

}
