package sortAlgorithms;

public class bubbleSort {
	public static char[] sort(char[] array) {
				
			for(int i =0; i < array.length-1; i++) {
				
				for(int j =0; j < array.length-i-1; j++) {
					if(array[j] > array[j+1]) {
						char temp = array[j];
						array[j]= array[j+1];
						array[j+1] = temp;
						}
			
					}
				
				}
			return array;
				
			}
}

/*
	O(n^2)
	For each iteration of the second loop it positioned the greater number in the last position.
	Each iteration is more short than the previous one.
*/