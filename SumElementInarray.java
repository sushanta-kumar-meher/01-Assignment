package com.sushanta;

class SumElementInarray{
	   public static void main(String args[]){
	      int[] array = {1, 6, 4, 3, 2, 2, 3, 8, 1};
	      int sum = 0;
	      
	      for( int num : array) {
	          sum = sum+num;
	      }
	      System.out.println("Sum of array elements is:"+sum);
	   }
	}
