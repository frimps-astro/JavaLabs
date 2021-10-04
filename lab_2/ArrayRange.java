import java.util.Random;

public class ArrayRange{

	public static void main(String args[]){
		//declare array
		int[] array = new int[6];
		//instantiate random class
		Random rand = new Random();
		//take initial random value: check lab1 question 1 for similar codes
		//and documentation as to why 49 as upper and +1
		int val = rand.nextInt(49)+1;

		//counter variable to control loop
		int counter = 0;
		boolean check = false; //does array contain val

		//do we already have 6 integers in array or not
		while(counter < 6){
			//loop through array and check weda element alrady exists
			for(int v:array){
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
				array[counter] = val;
				//pick another random
				val = rand.nextInt(49)+1;
				//increment counter
				counter++;
			}
			//reset check just in case
			check = false;
		}
		//print elements to confirm
		for(int i:array)
			System.out.println(i);
	}
}
