import java.util.*;

public class NumberName{
	public static void main(String args[]){
		Random rand = new Random();
		int num = rand.nextInt(9);

		//use switch to find number name
		String num_name = "zero";
		switch(num){
			case 1:
				num_name = "one";
				break;
			case 2:
				num_name = "two";
				break;
			case 3:
				num_name = "three";
				break;
			case 4:
				num_name = "four";
				break;
			case 5: 
				num_name = "five";
				break;
			case 6:
				num_name = "six";
				break;
			case 7:
				num_name = "seven";
				break;
			case 8:
				num_name = "eight";
				break;
			case 9:
				num_name = "nine";
				break;
			default:
				break;
		}

		System.out.println(num+" is "+num_name);
	}
}
