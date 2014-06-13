/*
* I was trying a sort algorithm, and this one works but not for much after an integer array larger that 10000. Can anyone explain why?
*/
package random;
import java.util.*;

public class test {
	public static void main(String[] args) {
		int[] y = new int[10000];
		Random r = new Random();
		for(int w = 0; w < y.length; w++){
			y[w] = r.nextInt();
		}
		long startTime = System.currentTimeMillis();
		y = sort(y);
		System.err.println(Arrays.toString(y));
		System.out.println(System.currentTimeMillis() - startTime);
	}
	public static int[] sort(int[] nums){
		for(int w = 1; w < nums.length; w++){
			if(nums[w] >= nums[w - 1]){
			}
			else{
				int x = nums[w - 1];
				nums[w - 1] = nums[w];
				nums[w] = x;
			}
		}
		boolean sorted = true;
		for(int w = 1; w < nums.length && sorted; w++){
			if(nums[w] >= nums[w-1]){
				
			}
			else
				sorted = false;
		}
		if(!sorted)
			return sort(nums);
		return nums;
	}
}
