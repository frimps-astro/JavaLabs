package Codes.JavaLabs.lab_3;

// import java.util.*;

public class TradeIDException extends Exception{

	public TradeIDException(String exc){
		super(exc);
	}

	// static String tradeIDExcept(List<Trade> ts){
	// 	boolean check = false;
	// 	for(int i=0; i<ts.size(); i++){
	// 		for(int j=(i+1); j<ts.size(); j++){
	// 			if(ts.get(i).id == ts.get(j).id){
	// 				check = true;
	// 				break;	
	// 			}
	// 		}
	// 	}
	// 	if(check){
	// 		return "Exception caught with duplicate in IDs";
	// 	}else{
	// 		return "";
	// 	}
	// }

}
