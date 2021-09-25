package csi.lopez.pkg;

import java.util.Arrays;

public class EvenOdd2D {

	public EvenOdd2D() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		int[][] arr = new int[10][10];
		
	
		
		
		
		checkOddEven(arr);
	}
	
	

	public static void checkOddEven(int[][] arr) {
		boolean isEven = false;
		boolean isOdd = false;
		
		
		
		
		for(int i = 0; i < arr.length; i++) {
		    for(int j = 0; j < arr[i].length; j++) {
		    	 arr[i][j] = (int) (Math.random()*5);
		    	
		    	if(arr[i][j] % 2 == 0) {
		    		arr[i][j] = 0;
		    	} if(arr[i][j] % 2 != 0) {
		    		arr[i][j] = 1;
		    	}
		             
//		    	if(arr[i][j] %2 == 0) {
//		    		isEven = true;
//
//		    	} else if(arr[i][j] %2 != 0) {
//		    		isOdd = true;
//		    	}
		    	
//		    	if(isEven == true) {
//		    		arr[j][i] = 0;
//		    	}
//		    	
//		    	if(isOdd = true) {
//		    		arr[i][j] = 1;
//		    	}
		    }
		    System.out.println(Arrays.toString(arr[i]));
		}
		
		
	}
	
	
}

