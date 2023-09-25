/* Logic: we can use for loop for the iterations within the given input
all the zeroes must be at the end within the array and non zero values at the beginning without disturbing the relative order of the other elements*/

package org.aditys.leetcodemetsolutions;

import java.util.Scanner;

public class MoveZeroes {
	 public void MoveZeroes(int[] nums) {
	        Scanner A = new Scanner(System.in);
	         int n = 0;
	        for(int i = 0; i < nums.length; i++)
	            if(nums[i] != 0) {
	                int tmp = nums[n];
	                nums[n] = nums[i];
	                nums[i] = tmp;
	                n += 1;
	                System.out.println("Enter number of strings: " + " " + i );
	            }
	    }
	}



