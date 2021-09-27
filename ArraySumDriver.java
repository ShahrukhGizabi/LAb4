public class ArraySumDriver {
	private final static int ARRAY_SIZE = 6;
	static int[] fibonnaci = new int[500]; 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int index = 0;

		Integer[] myArray = new Integer[ARRAY_SIZE];
		
		myArray[index++] = 13;
		myArray[index++] = 5;
		myArray[index++] = 12;
		myArray[index++] = 6;
		
		int sum = sumOfArray(myArray, 3);
		System.out.println(sum);
		
		myArray[index++] = 7;
		myArray[index++] = 1;
		
		sum = sumOfArray(myArray, 5);
		System.out.println(sum);
		
		for(int i = 0; i < 19; i++) {
			
			int fib = fibonacci(i);
			System.out.println( fib  + " ");
		}
	}
	
	/**
	 * Recursive method for generating sum of values in array
	 * @param arr array of Integers
	 * @param num index of array to sum all previous index values (including num)
	 * @return sum of array values
	 */
	public static <T> int sumOfArray(T[] arr, int num) {
      
		
		if (num > 0) 
			{
			return (int) arr[num] + sumOfArray(arr, --num);
			}

		else {
			
			return (int) arr[num];
		}
    }
	
	

    public static int fibonacci(int n){
      
    	switch (n) {
    	
    	case 0:
    		return 0;
    		
    	case 1:
    		return 1;
    		
    		default:
    			fibonnaci[n] = fibonacci(n-1) + fibonacci(n-2);

    			return fibonnaci[n];
    	}
    	

    }
}