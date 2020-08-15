package com.sushanta;

import java.util.HashMap; 
public class RemoveDuplicateApp { 
  
    public static void main(String args[]) 
  
    { 
        int ar[] = { 1, 2, 5, 5, 6, 6, 7, 2 }; 
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>(); 
        for (int i = 0; i < ar.length; i++) { 
            hm.put(ar[i], i); 
        } 
        
        System.out.println(hm.keySet()); 
  
    } 
}