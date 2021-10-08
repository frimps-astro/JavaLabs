package Codes.JavaLabs.lab_2;

import java.util.*;

public class ArrayListRange{

	public static void main(String args[]){
		//declare array
		List<Integer> array = new ArrayList<Integer>();
		//instantiate random class
		Random rand = new Random();
		//take initial random value: check lab1 question 1 for similar codes
		//and documentation as to why 49 as upper and +1
		Integer val = rand.nextInt(49)+1;

		//counter variable to control loop
		Integer counter = 0;
		boolean check = false; //does array contain val

		//do we already have 6 integers in array or not
		while(counter < 6){
			//loop through array and check weda element alrady exists
			for(Integer v:array){
				if(v == val){
					check = true;
					//generate new random number
					val = rand.nextInt(49)+1;

					//exit the for loop
					break;
				}
			}
			//if not existing then add
			if(check == false){
				array.add(val);
				//pick another random
				val = rand.nextInt(49)+1;
				//increment counter
				counter++;
			}
			//reset check just in case
			check = false;
		}
		//print elements to confirm
		System.out.println("Before sorted");
		for(int i:array)
			System.out.println(i);

		//modified later to add sorting
		array.sort(null);
		System.out.println("\n After been sorted");
		for(int i:array)
			System.out.println(i);
	}
}
