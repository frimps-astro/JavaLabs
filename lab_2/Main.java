package Codes.JavaLabs.lab_2;

class ArrayClass{

	public ArrayClass(int size){
		int[] array = this.setArray(size);

		for(int i:array)
			System.out.println(i);
	}	
	public int[] setArray(int size){
		int[] array = new int[size];
		for(int i=0; i<size; i++){
			array[i] = (i+1);
		}

		return array;
	}
}

public class Main{

	public static void main(String args[]){
		ArrayClass arr = new ArrayClass(10);	
	}
}
