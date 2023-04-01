package leetcode;

import java.util.Hashtable;

public class ContainsDuplicate {
	
	 public boolean containsDuplicate(int[] nums) {
		 Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
		 
		 for(int i=0; i<nums.length; i++){
			 if(ht.get(nums[i]) != null){
				 ht.put(nums[i], ht.get(nums[i])+1);
	         }
	         else{
	            ht.put(nums[i],1);
	         }
	        }

	      for(int i=0;i<ht.size(); i++){
	    	  if(ht.get(nums[i])>=2)
	    		  return true;
	      }
	    return false;
	}

	public static void main(String[] args) {
		int arr[] = new int[] {1,3,2,1};
		ContainsDuplicate cd = new ContainsDuplicate();
		System.out.println(cd.containsDuplicate(arr));

	}

}
