package Codes.JavaLabs.lab_3;

import java.util.*;

public class Trade {
	public String id;
	public String symbol;
	public int quantity;
	public double price;

	public Trade(String id, String symbol, int quantity, double price) {
		this.id = id;
		this.symbol = symbol;
		this.quantity = quantity;
		this.price = price;
	}

	public Trade(String id, String symbol, int quantity) {
		this.id = id;
		this.symbol = symbol;
		this.quantity = quantity;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static void main(String args[]) {
		try {
			createTrades();
		} catch (TradeIDException x) {
			System.out.println(x.getMessage());
		}
	}

	public void toString(Trade t) {
		String obj = "{\n'id':" + t.id + ",\n'symbol':" + t.symbol + ",\n'quantity':" + t.quantity + ",\n'price':"
				+ t.price + "\n}";

		System.out.println(obj);
	}

	static void createTrades() throws TradeIDException {

		Trade t1 = new Trade("T1", "APPL", 100, 15.25);
		Trade t2 = new Trade("T2", "KOAA", 300, 10.44);
		Trade t3 = new Trade("T3", "FAKL", 180, 17.89);
		Trade t4 = new Trade("T4", "AABD", 45, 10.2);
		// System.out.println(t1.symbol);
		List<Trade> ts = new ArrayList<Trade>();
		ts.add(t1);
		ts.add(t2);
		ts.add(t3);
		ts.add(t4);

		boolean check = false;
		for (int i = 0; i < ts.size(); i++) {
			for (int j = (i + 1); j < ts.size(); j++) {
				if (ts.get(i).id == ts.get(j).id) {
					check = true;
					break;
				}
			}
			if (check)
				break;
		}
		if (check) {
			throw new TradeIDException("\n\nOOPS!! A duplicated ID Exception was thrown");
		}

		t1.toString(t1);
		Trader tr1 = new Trader("Clement Osei");
		Trader tr2 = new Trader("Kaakyire Astro");
		Trader tr3 = new Trader("Emmanuel Nti");
		Trader tr4 = new Trader("Kofi Yeboah");

		tr1.addTrade(t1.quantity, t1.price);
		tr2.addTrade(t2.quantity, t2.price);
		tr3.addTrade(t3.quantity, t3.price);
		tr4.addTrade(t4.quantity, t3.price);

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