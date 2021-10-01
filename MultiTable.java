public class MultiTable{
	public static void main(String args[]){
		//printing multiplication table from 1 to 10 using for loop
		for(int i=1; i<=10; i++){
			System.out.println("------Mulitplication Table for "+i+"------");
			for(int j=1; j<=12; j++){
				System.out.println("\t\t"+i+"x"+j+"="+(i*j));
			}
		}
	}
}
