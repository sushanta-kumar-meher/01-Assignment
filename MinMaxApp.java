
class MinMaxApp { 
	
	
	 public static void main (String[] args)  
	    { 
	        int array[] = { 1, 2, 5, 5, 6, 6, 7, 2 }; 
	        int n = array.length; 
	        
	        System.out.println( "Minimum element is" + getMin(array, n)); 
	        System.out.println( "Maximum element is" + getMax(array, n)); 
	    } 
      
    static int getMin(int array[], int n) 
    { 
        int res = array[0]; 
          
        for (int i = 1; i < n; i++) 
            res = Math.min(res, array[i]); 
        return res; 
    } 
      
    static int getMax(int array[], int n) 
    { 
        int res = array[0]; 
          
        for (int i = 1; i < n; i++) 
            res = Math.max(res, array[i]); 
        return res; 
    } 
  
    
    
} 