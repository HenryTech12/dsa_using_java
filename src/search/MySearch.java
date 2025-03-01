package search;
import sort.*;

public class MySearch
{
	public int linearSearch(int[] data, int target) {
		 for(int i = 0; i < data.length; i++) {
			 if(data[i] == target) {
				 return i;
			 }
		 }
		 return -1;
	}
	
	//always pass in a sorted array
	public int binarySearch(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
	   
		while(left <= right) {
			int mid = (left + right) / 2;
			if(arr[mid] == target) {
				return mid;
			}
			else if(arr[mid] < target) {
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
		}
		return -1;
	}
}
