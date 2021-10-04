public class Trade{
	public static String id;
	public static String symbol;
	public static int quantity;
	public static double price;

	public Trade(String id, String symbol, int quantity, double price){
		this.id = id;
		this.symbol = symbol;
		this.quantity = quantity;
		this.price = price;
	}

	
	public Trade(String id, String symbol, int quantity){
		this.id = id;
		this.symbol = symbol;
		this.quantity = quantity;
	}

	public void setPrice(double price){
		this.price = price;
	}

	public static void main(String args[]){
		Trade t1 = new Trade("T1", "APPL", 100, 15.25);
		Trade t2 = new Trade("T2", "KOAA", 300, 10.44);
		Trade t3 = new Trade("T3", "FAKL", 180, 17.89);
//		System.out.println(t1.symbol);

//		t1.toString(t1);
		Trader tr1 = new Trader("Clement Osei");
		Trader tr2 = new Trader("Kaakyire Astro");
		Trader tr3 = new Trader("Emmanuel Nti");

		tr1.addTrade(t1.quantity, t1.price);
		tr2.addTrade(t2.quantity, t2.price);
		tr3.addTrade(t3.quantity, t3.price);
	
	}

	public void toString(Trade t){
		String obj = "{\n'id':"+t.id+",\n'symbol':"+t.symbol+",\n'quantity':"+t.quantity+",\n'price':"+t.price+"\n}";

		System.out.println(obj);
	}
}

class Account{
	public static double total = 0;

	public static void setTotal(double t){
		total += t;
	}

	public double getTotal(){
		return this.total;
	}
}

class Trader{
	public String name;
	
	public Trader(String name){
		this.name = name;
		Account acc = new Account();
		System.out.println("A new account with the name "+ name+ " has been created");
	}

	public void addTrade(int q, double p){
		System.out.println("Value before: "+Account.total);
		Account.setTotal(q*p);

		System.out.println(Account.total);		
	}
	
}
