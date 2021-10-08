package Codes.JavaLabs.lab_4;

import java.util.*;

public class TradeStream {
	public String id;
	public String symbol;
	public Integer quantity;
	public Double price;
	public Integer time;
	public static int counter = 1;

	//sort inner class
	class SortByTime implements Comparator<TradeStream>{
		public int compare(TradeStream t1, TradeStream t2){
			return t1.time.compareTo(t2.time);
		}
	}
	class SortByQuantity implements Comparator<TradeStream>{
		public int compare(TradeStream t1, TradeStream t2){
			return t1.quantity.compareTo(t2.quantity);
		}
	}

	public TradeStream(){}
	
	public TradeStream(String id, String symbol, int quantity, double price, int time) {
		this.id = id;
		this.symbol = symbol;
		this.quantity = quantity;
		this.price = price;
		this.time = time;
	}

	public static void convertTime(int time) {
		int milliseconds = time % 1000;
		int seconds = (time / 1000) % 60;
		int minutes = (time / (1000 * 60)) % 60;
		int hour = (time / (1000 * 60 * 60)) % 24;

		System.out.printf("%02d:%02d:%02d.%d\n",hour,minutes,seconds,milliseconds); //10:20:00.3
	}

	public TradeStream(String id, String symbol, int quantity) {
		this.id = id;
		this.symbol = symbol;
		this.quantity = quantity;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static void main(String args[]) {
		// try {
		// 	createTrades();
		// } catch (Exception x) {
		// 	System.out.println(x.getMessage());
		// }
	}

	public void toString(TradeStream t) {
		String obj = "{\n'id':" + t.id + ",\n'symbol':" + t.symbol + ",\n'quantity':" + t.quantity + ",\n'price':"
				+ t.price + "\n}";

		System.out.println(obj);
	}

	static void createTrades() {

		// TradeStream t1 = new TradeStream("T1", "APPL", 100, 15.25);
		// TradeStream t2 = new TradeStream("T2", "KOAA", 300, 10.44);
		// TradeStream t3 = new TradeStream("T3", "FAKL", 180, 17.89);
		// TradeStream t4 = new TradeStream("T4", "AABD", 45, 10.2);
		// // System.out.println(t1.symbol);
		// List<TradeStream> ts = new ArrayList<TradeStream>();
		// ts.add(t1);
		// ts.add(t2);
		// ts.add(t3);
		// ts.add(t4);

		// t1.toString(t1);
		// Trader tr1 = new Trader("Clement Osei");
		// Trader tr2 = new Trader("Kaakyire Astro");
		// Trader tr3 = new Trader("Emmanuel Nti");
		// Trader tr4 = new Trader("Kofi Yeboah");

		// tr1.addTrade(t1.quantity, t1.price);
		// tr2.addTrade(t2.quantity, t2.price);
		// tr3.addTrade(t3.quantity, t3.price);
		// tr4.addTrade(t4.quantity, t3.price);

	}
}

class Account {
	public static double total = 0;

	public static void setTotal(double t) {
		total += t;
	}

	public double getTotal() {
		return this.total;
	}
}

class Trader {
	public String name;

	public Trader(String name) {
		this.name = name;
		Account acc = new Account();
		System.out.println("A new account with the name " + name + " has been created");
	}

	public void addTrade(int q, double p) {
		System.out.println("Value before: " + Account.total);
		Account.setTotal(q * p);

		System.out.println(Account.total);
	}

}