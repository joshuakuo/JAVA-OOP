package basic;

public class MinAvgMax {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArray = {4,2,9,1,5,6,8,7,0};
		//int len = intArray.length;
		
		//System.out.println("Minimum : " + min(intArray));
		//System.out.println("Average : " + avg(intArray));
		//System.out.println("Maximum : " + max(intArray));
		
		System.out.println("Something else ...");
		
		int i = 1 ;
		
		System.out.println("Before i assigned : " + i);
		
		i+=i++;
		//i+=i;
		System.out.println("After equation : " + i);
		//i++;
		//i+=i;
		
	i+=i++;
		System.out.println("After equation 2nd time : " + i);
		
		//i++;
		//i+=i;	
	i+=i++;
		System.out.println("After equation 3rd time : " + i);

	}
	
	public static int min(int[] iarray) {
		
		int i = 0;
		int len = iarray.length;
		int min = 0;
		
		while (i < len -1) {
			if (iarray[i] > iarray[i+1]) {
				min = iarray[i+1];
			} else {
				min = iarray[i];
			}
			i++;
		}
		return min;
	}
	
	public static int sum(int[] iarray) {
		int total = 0;
		int len = iarray.length;

		for (int i=0; i < len; i++) {
			total = total + iarray[i];
		}
		
		return total;
	}
	
	public static float avg(int[] iarray) {
		
		float sum = sum(iarray);
		float len = iarray.length;
		
		System.out.println("Sum is equal : " + sum);
		System.out.println("Number of elements : " + len);
		
		return (sum/len);
		
	}

	public static int max(int[] iarray) {
		
		int i = 0;
		int len = iarray.length;
		int max = 0;
		
		while (i < len) {
			if (iarray[i] > max) {
				max = iarray[i];
			} 
			i++;
		}
		return max;
	}


}
