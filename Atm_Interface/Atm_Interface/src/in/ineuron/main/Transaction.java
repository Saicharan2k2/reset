package in.ineuron.main;
public class Transaction {
	int amount;
	String msg;
	public Transaction(int amount,String msg)
	{
		this.amount=amount;
		this.msg=msg;
	}
	public int getAmount()
	{
		return amount;
	}
	public String getMessage()
	{
		return msg;
	}
}