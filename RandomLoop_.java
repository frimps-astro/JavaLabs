import java.util.*;

public class RandomLoop_{
	public static void main(String args[]){
		Random rand = new Random();
		
		//using a do while to generate numbers
		int num = -1;
		while(num != 0){
		//assuming the range specified(-3 to +3) is inclusive
		//java by default doesn't include the bound so 1'm using 7(^6(-3)) to include 3
		//then random number -3 to include -3
		num = rand.nextInt(7)-3;
		System.out.println(num);
		}
	}
}
