package com.sushanta;

public class SumEqualToGivenNum
{ 
    public static void main(String args[]) 
    { 
        int[] arr = { 3, 6, 8, -8, 10, 8  }; 
        int sum = 16; 
        getPairsCount(arr, sum); 
    } 
  
    public static void getPairsCount(int[] arr, int sum) 
    { 
  
        int count = 0;
  
        for (int i = 0; i < arr.length; i++) 
            for (int j = i + 1; j < arr.length; j++) 
                if ((arr[i] + arr[j]) == sum) 
                    count++; 
  
        System.out.printf("Count of pairs is"+ count); 
    } 
} 