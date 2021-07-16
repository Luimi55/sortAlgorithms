package sortAlgorithms;

public class bucketSort {
	public static int[] sort(int[] array){
		int max = maxValue(array);
		int min = minValue(array);
		
		int[] bucket = new int[(max - min)+1];
		
		for(int i = 0; i < array.length; i++) {
			bucket[array[i] - min] += 1;
		}
		
		int j = 0;
		for(int i = 0; i < bucket.length; i++) {
			
			if(bucket[i] != 0) {
				array[j] = i + min;
				bucket[i] -= 1;
				i--;
				j++;
			}
		}

		return array;
	}
	
public static int maxValue(int[] array) {
		
		int max = array[0];
		
		for(int i = 1; i< array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}

public static int minValue(int[] array) {
	
	int min = array[0];
	
	for(int i = 1; i< array.length; i++) {
		
		if(min > array[i]) {
			min = array[i];
		}
	}
	return min;
}
}
