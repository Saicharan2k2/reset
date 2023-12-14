package in.ineuron.base;
import in.ineuron.main.*;
import java.util.Scanner;
public class Atm {
	Bank b;
	Account acc;
	Account_Holder accHold;
	public Atm(Bank b,Account acc) {
		this.b=b;
		this.acc=acc;
	}
	Scanner sc=new Scanner(System.in);
	void begin() {
		System.out.println("*********Welcome To Ineuron Bank**********\n Please insert card and enter id & pin\n");
		int id=sc.nextInt();
		int pin=sc.nextInt();
		accHold=new Account_Holder(id,pin);
		if(verify(accHold)) {
			display();
		}
		else {
			System.out.println("Invalid Credentials !!!\n");
		}
		}
	boolean verify(Account_Holder accHolder)
	{
		return accHold.getId()==214 && accHold.getPin()==2002;
	}
		
	void display()
	{
		while(true)
		{
			System.out.println("Enter your choice ::");
			System.out.println(" 1. Balance Enquiry\t 2. Withdraw\n 3. Deposit\t\t 4. Mini Statement\n 5. Transfer\t\t 6. Exit\n");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:System.out.println("Balance :: "+"Rs."+acc.getBalance());
					break;
			case 2:System.out.println("Enter amount :: ");
					int wamount=sc.nextInt();
					acc.withdraw(wamount);
					break;
			case 3:System.out.println("Enter amount :: ");
			        int damount=sc.nextInt();
			        acc.deposit(damount);
			        break;
			case 4:System.out.println("----Mini statement----\n");
			        acc.miniStatement();
			        break;
			case 5:System.out.println("Enter ID :: ");
					int id=sc.nextInt();
					System.out.println("Enter Amount :: ");
					int amount=sc.nextInt();
					Account acc2=b.getAccount(id);
					acc.transfer(acc2,amount);
					break;
			case 6:System.out.println("Thank You !! Have a nice day !!\n");
					System.exit(0);
			default:System.out.println("Invalid option!!!\n");
					break;
			}
		}
	}
		public static void main(String[] args) {
			Bank b=new Bank();
			Account acc1=new Account(1);
			Account acc2=new Account(2);
			b.addAcc(acc1);
			b.addAcc(acc2);
			Atm a=new Atm(b,acc1);
			a.begin();
	}
}
