import java.util.*;

public class SixNumbers{
	public static void main(String args[]){
		//print 6 numbers from range 1 to 49
		Random rand = new Random();
		for(int i=0; i<6; i++){
			//+1 is to make sure if 0 is generated it increases to 1 to meet
			//the range requirement; it would be generated up to 48(+1)->49;
			System.out.println(rand.nextInt(49)+1);
		}
	}
}
