package stack;

public class MyStack
{
	private int[] arr;
	private int size = 0;
	
	public void push(int data) {
		expand();
	
		int temp[] = new int[size];
		for(int i = 0; i < size-1; i++) {
			temp[i+1] = arr[i];
		}
		arr = temp;
		arr[0] = data;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int size() {
		return size;
	}
	
	public int peek() {
		return arr[0];
	}
	
	public int pop() {
		int skip = 1;
		int tempSize = size-1;
		int temp[] = new int[tempSize];
		for(int i = 0; i < size-1; i++) {
			temp[i] = arr[skip+i];
		}
		int removedValue = arr[skip-1];
		arr = temp;
		size = tempSize;
		return removedValue;
	}
	
	
	private void expand() {
	  int tempSize = size +1;
	  int temp[] = new int[tempSize];
	  for(int i = 0; i < size; i++) {
		  temp[i] = arr[i];
	  }
	  arr = temp;
	  size = tempSize;
	}
	
	public boolean contains(int data) {	
		return (binarySearch(data) != -1);
	}
	
	public int[] sort() {
		int temp[] = arr;
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size - 1; j++) {
				if(arr[j] > arr[j+1]) {
					int max = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = max;
				}
			}
		}
		return temp;
	}
	
	public int[] copy(int[] data) {
	  int temp[] = new int[data.length];
	  for(int i = 0; i < data.length; i++) {
		  temp[i] = arr[i];
	  }
	  return temp;
	}
	
	private int binarySearch(int target) {
		int left = 0;
		int right = arr.length - 1;
		int unsorted[] = copy(arr);
		
		sort();
		while(left <= right) {
			int mid = (left + right) / 2;
			if(arr[mid] == target) {
				arr = unsorted;
				return mid;
			}
			else if(arr[mid] < target) {
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
		}
		arr = unsorted;
		return -1;
	}
	
	public int popAt(int index) {
		int tempSize = size-1;
		int temp[] = new int[tempSize];
		int removedValue = arr[size-1];
		boolean isZero = false;
		isZero = (index == 0);
		
		for(int i = 0; i < size-1; i++) {
			if(i != index) {
				if(!isZero) {
			     temp[i] = arr[i];
			   }
			   else {
				 temp[i] = arr[i+1];
			   }
			}
			else {
			   removedValue = arr[i];
			   temp[i] = arr[i+1];		   
			}
		}
		arr = temp;
		size = tempSize;
		return removedValue;
	}
	
	public void clear() {
		arr = new int[0];
		size = 0;
	}
	
	public int peekAt(int index) {
		return arr[index];
	}
	
	public void show() {
		for(int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
	}
	
}
