package com.sushanta;

public class FindCommonElement {
	
	
	public static void  commonElements(int arr1[], int arr2[], int arr3[]) {
		 
        for(int i = 0; i < arr1.length; i++) {
 
            for(int j = 0; j < arr2.length; j++) {
 
                for(int k = 0; k < arr3.length; k++) {
 
                     if(arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                          System.out.println(arr1[i]);
                      }
                  }
              }
          }
 }
	

	public static void main(String[] args) {
		
		
	int	ar1[] = {1, 5, 10, 20, 40, 80};
	int	ar2[] = {6, 7, 20, 80, 100};
	int	ar3[] = {3, 4, 15, 20, 30, 70, 80, 120};

		FindCommonElement element=new FindCommonElement();
		
		element.commonElements(ar1, ar2, ar3);
		
	}

}
