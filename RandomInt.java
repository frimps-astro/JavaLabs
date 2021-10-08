package Codes.JavaLabs;

import java.util.*;

public class RandomInt{
	public static void main(String args[]){
		//instantiate the Random class
		Random rand = new Random();

		//generate a random number up to 100
		int rand_num = rand.nextInt(100);

		//check whether number is even or odd
		if(rand_num%2 ==0){
			System.out.println(rand_num+" is an even number");
		}else{
			System.out.println(rand_num+" is an odd number");
		}

		//use if else to check the temperature of the number
		String temperature = "frozen";// a variable to store temp of number
		if(rand_num > 0 && rand_num < 15)
			temperature = "cold";
		else if(rand_num > 14 && rand_num <25)
			temperature = "cool";
		else if(rand_num > 24 && rand_num < 41)
			temperature = "warm";
		else if (rand_num > 40 && rand_num < 61)
			temperature = "hot";
		else if (rand_num > 60 && rand_num < 81)
			temperature = "very hot";
		else if(rand_num >80 && rand_num < 100)
			temperature = "extremely hot";
		else if(rand_num == 100)
			temperature = "boiling";
		//output the result
		System.out.println(temperature);
	}
}
