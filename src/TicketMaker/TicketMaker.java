package TicketMaker;

public class TicketMaker {
	private int ticket = 1000;
	private static TicketMaker singketon = new TicketMaker();

	private TicketMaker() {

	}

	public static TicketMaker getInstance() {
		return singketon;
	}

	public synchronized int getNextTicketNumber() {
		return ticket++;
	}

}
