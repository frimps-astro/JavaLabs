import java.util.*;

public class RandomLoop{
	public static void main(String args[]){
		Random rand = new Random();
		
		//using a do while to generate numbers
		int num = 0;
		do{
			//assuming the range specified(-3 to +3) is inclusive
			//java by default doesn't include the bound so I'm using 7(^6(-3)) to include 3
			//then random number -3 to include -3
			num = rand.nextInt(7)-3;
			System.out.println(num);
		}while(num != 0);
	}
}
