public class Program3 {

	private int[][] sums; 	// This matrix holds the sums of all contiguous subarrays in cities,
								// where i is the beginning index of the subarray and j the ending index
	private int[][] optMat; // This matrix holds the optimal gold values for all contiguous subarrays
	
	
    public int maxCoinValue (int[] cities) {
        // Initialization 
    	int dim = cities.length;
    	sums = new int[dim][dim];	  
    	optMat = new int[dim][dim]; 
    	
    	// Summation
    	for(int i = 0; i < dim; i++) {
    		int prev = 0;
    		
    		for(int j = 0; j < dim; j++) {
    			if(j < i) {		// No need to double count the same subarray
    				sums[i][j] = -1;
    				continue;
    			}
    			
    			prev += cities[j];	// Running sum of contiguous subarray
    			sums[i][j] = prev;
    			
    		}
    	}
    	
    	// Populating optimal value matrix
    	// These loops find the max value among all subsets of contiguous arrays within cities
    	for(int j = 0; j < dim; j++) {
    		for(int i = 0; i < dim-j; i++) {
    			int col = j + i;
    			int leftArr, rightArr;
    			int temp;
    			int max = 0;
    			
    			for(int barrier = i; barrier < col; barrier++) {	// Move the barrier along the subarray cities[i->j]
    				
    				leftArr = subarrayOPT(i, barrier, cities);	// Find the optimal values 
    				rightArr = subarrayOPT(barrier+1, col, cities);
    				
    				temp = Math.min(leftArr, rightArr);	// The solution to this situation will be the minimum among the solution to the subproblems
    				max = Math.max(max, temp);			// Compare all solutions and choose the highest value
    				
    			}
    			optMat[i][col] = max;	// Update optimal matrix
    	
    		}
    	}
        return optMat[0][dim-1];
        
    }
    
    // Helper function
    // Used to determine the accruable value of a subarray
    public int subarrayOPT(int i, int j, int[] cities) {
    	
    	// If not base case, then optimum is reachable and predetermined
		return sums[i][j] + optMat[i][j];
    }
    
    
    
}
