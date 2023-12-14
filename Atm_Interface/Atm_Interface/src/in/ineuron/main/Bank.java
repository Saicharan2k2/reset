package in.ineuron.main;
import java.util.ArrayList;
import java.util.List;
public class Bank {
	List<Account> ac;
	public Bank()
	{
		ac=new ArrayList<>();
	}
	public void addAcc(Account acc) {
		ac.add(acc);
	}
	public Account getAccount(int id)
	{
		for(Account a: ac)
		{
			if(a.getId()==id)
			{
				return a;
			}
		}
		return null;
	}
}