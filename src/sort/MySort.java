package sort;

public class MySort
{
	
	public int[] bubbleSort(int[] data, SortType type) {
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data.length - i - 1; j++) {
				if(data[j] > data[j+1]) {
					  swap(data, j, j+1);
			   }
			}
		}
		return data;
	}
	
	public void swap(int[] data, int index1, int index2) {
		int temp = data[index1];
		data[index1] = data[index2];
		data[index2] = temp;
	}
	
	public int[] selectionSort(int[] data) {
	  for(int i = 0; i < data.length; i++) {
		  int minIndex = i;
			for(int j = i+1; j < data.length; j++) {
				if(data[j] < data[minIndex]) {
				    minIndex = j;
				 }
			} 
			int temp = data[i];
	        data[i] = data[minIndex];
		    data[minIndex] = temp;
		}
		return data;
	}

}
