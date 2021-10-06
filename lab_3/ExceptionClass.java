package Codes.JavaLabs.lab_3;

public class ExceptionClass{
	public static void main(String[] args){
		ExceptionClass.methodOne();
	}

	static void methodOne() throws ArrayIndexOutOfBoundsException{
		int[] array = new int[1];

		System.out.println(array[2]);
	}
}
