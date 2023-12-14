package in.ineuron.main;
import java.util.ArrayList;
import java.util.List;
public class Account {
    private int id;
    private int bal;
    private List<Transaction> tr;
    public Account(int id) {
        this.id = id;
        this.bal = 0;
        this.tr = new ArrayList<>();
    }
    public int getId() {
        return id;
    }
    public int getBalance() {
        return bal;
    }
    public void deposit(int amount)
	{
		bal+=amount;
		tr.add(new Transaction(amount,"Amount Deposited"));
		System.out.println("Amount Rs."+amount+" Deposited Successfully!!!");
	}
	public void miniStatement() {
		for(Transaction m:tr)
		{
			System.out.println(m.getMessage()+"   "+" Rs."+m.getAmount());
			
		}System.out.println("Closing Balance ::  Rs."+bal);
	}
    public void withdraw(int amount) {
        if (amount > bal) {
			System.out.println("Insufficient Bank Balance\n Please try again after checking bank balance\n");
            return;
        }
        bal -= amount;
        tr.add(new Transaction(amount,"Amount Withdrawn"));
		System.out.println("Please Collect your money\nWithdraw Successful\n");
    }
    public void transfer(Account second, int amount) {
    	if(second == null) {
    		System.out.println("Invalid ID!!!");
    		return;
    	}
        if (amount > bal) {
			System.out.println("Insufficient Bank Balance\n Please try again after checking bank balance");
            return;
        }
        bal -= amount;
        second.deposit(amount);
        System.out.println("Transfer Successfull.........!");
        tr.add(new Transaction(amount, "Transfer  to  Account " + second.getId()));
        second.tr.add(new Transaction(amount, "Transfer from Account " + id));
    }
}