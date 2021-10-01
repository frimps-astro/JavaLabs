import java.util.*;
import java.util.Scanner;

public class SixNumbers_{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		System.out.println("\nSix numbers between 1 and "+number+" is ");
		outputSix(number);
	}
	
	static void outputSix(int n){
		//print 6 numbers from range 1 to 49
		Random rand = new Random();
		for(int i=0; i<6; i++){
			System.out.println(rand.nextInt(n)+1);
		}
	}

}
