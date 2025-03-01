package queue;

public class MyQueue
{
	private int[] arr;
	private int size = 0;
	
	public void enqueue(int data) {
		expand();
		arr[size-1] = data;
	}
	
	private void expand() {
		int tempSize = size + 1;
		int temp[] = new int[tempSize];
		for(int i = 0; i < size; i++) {
			temp[i] = arr[i];
		}
		arr = temp;
		size = tempSize;
	}
	
	public int dequeue() {
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
	
	public int peek() {
		return arr[0];
	}
	
	public int peekAt(int index) {
		return arr[index];
	}
	
	public void clear() {
		arr = new int[0];
		size = 0;
	}
	
	public boolean contains(int data) {
		for(int i = 0; i < size; i++) {
			if(arr[i] == data) {
				return true;
			}
			break;
		}
		return false;
	}
	
	public int dequeueAt(int index) {
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
				temp[i] = arr[i+1];
				removedValue = arr[i];
			}
		}
		arr = temp;
		size = tempSize;
		return removedValue;
	}
	
	public int[] copy(int[] data) {
		int temp[] = new int[data.length];
		for(int i = 0; i < data.length; i++) {
			temp[i] = data[i];
		}
		return temp;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int size() {
		return size;
	}
	
	
	public void show() {
		for(int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
	}
}
