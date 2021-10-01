import java.util.*;

public class SixNumbers{
	public static void main(String args[]){
		//print 6 numbers from range 1 to 49
		Random rand = new Random();
		for(int i=0; i<6; i++){
			System.out.println(rand.nextInt(49)+1);
		}
	}
}
