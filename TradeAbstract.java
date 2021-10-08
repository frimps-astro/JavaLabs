package Codes.JavaLabs;

public abstract class TradeAbstract{
	public String id;
	public String symbol;
	public int quantity;
	public static double price;

	//public TradeAbstract(String id, String symbol, int quantity, double price){
	//	this.id = id;
	//	this.symbol = symbol;
	//	this.quantity = quantity;
	//	this.price = price;
	//}
	
	//public TradeAbstract(double dividend){}
	

	public void setPrice(double price){
		this.price = price;
	}


	public void toString(Trade t){
		String obj = "{\n'id':"+t.id+",\n'symbol':"+t.symbol+",\n'quantity':"+t.quantity+",\n'price':"+t.price+"\n}";

		System.out.println(obj);
	}

	abstract void calcDividend();
}

class BondTrade extends TradeAbstract{
	private static double dividend;

	
	public BondTrade(double dividend){
		this.dividend = dividend;
	}
	public static void main(String args[]){
		BondTrade bt = new BondTrade(18.90);

		bt.calcDividend();
	}
	
	void calcDividend(){
		System.out.println("Dividend in BondTrade class "+dividend);
	}
}

class FundTrade extends TradeAbstract{
	private static double percent;
	private static double price;

	public FundTrade(double price, double percent){
		this.percent = percent;
		this.price = price;
	}	

	
	void calcDividend(){
		double dividend = (percent/100) * this.price;
		
		System.out.println("Dividend in FundTrade class is "+dividend);
	}

	public static void main(String args[]){
		FundTrade ft = new FundTrade(56.89,45);
		ft.calcDividend();
	}
}



// class Account{
// 	public static double total = 0;

// 	public static void setTotal(double t){
// 		total += t;
// 	}

// 	public double getTotal(){
// 		return this.total;
// 	}
// }

// class Trader{
// 	public String name;
	
// 	public Trader(String name){
// 		this.name = name;
// 		Account acc = new Account();
// 		System.out.println("A new account with the name "+ name+ " has been created");
// 	}

// 	public void addTrade(int q, double p){
// 		System.out.println("Value before: "+Account.total);
// 		Account.setTotal(q*p);

// 		System.out.println(Account.total);		
// 	}
	
// }


