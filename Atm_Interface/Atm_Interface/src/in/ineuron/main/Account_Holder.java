package in.ineuron.main;
public class Account_Holder {
	private int id;
	private int pin;
	public Account_Holder(int id, int pin) {
		this.id = id;
		this.pin = pin;
	}
	public int getId() {
		return id;
	}
	public int getPin() {
		return pin;
	}
}
