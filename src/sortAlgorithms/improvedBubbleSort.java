package sortAlgorithms;

public class improvedBubbleSort {
public static char[] sort(char[] array) {
		
	int swap = 1;
	for(int i =0; i < array.length-1 && swap == 1; i++) {
		swap = 0;
		
		for(int j =0; j < array.length-i-1; j++) {
			if(array[j] > array[j+1]) {
				char temp = array[j];
				array[j]= array[j+1];
				array[j+1] = temp;
				swap = 1 ;
				}
	
			}
		
		}
	return array;
	}
}
/* The function of swap variable is detect if the array is already ordered*/