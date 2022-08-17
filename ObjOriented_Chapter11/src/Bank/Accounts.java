package Bank;

public class Accounts {
	private double balance; //bakiye
	 private double decreasing;
	 private double increasing;
	AccountClients customer1,customer2;
	
	public Accounts(double balance) {
		this.balance=balance;  //construct 1
	}
	
	public Accounts() {
	 //construct 2
	}
	
	public double withdrawMoney (double decreasing) {
		setDecreasing(decreasing);
		balance-=decreasing;
		return balance;
	}
	
	public double depositMoney(double increasing) {
		setIncreasing(increasing);
		balance+=increasing;
		return balance;
	}
	public void transferMoney(Accounts ac1,Accounts ac2,double amount) {
		ac1.setDecreasing(amount);
		ac1.withdrawMoney(amount);
		ac2.setIncreasing(amount);
		ac2.depositMoney(amount);
	}
	//set-get methods
	public double getBalance() {
		return balance;
	}
	
	public double getAmount() {
		return balance;
	}

	//*******************
	public double getDecreasing() {
		return decreasing;
	}
	
	public void setDecreasing(double decreasing) {
		this.decreasing=decreasing;
	}
	
	public double getIncreasing() {
		return increasing;
	}
	
	public void setIncreasing(double increasing) {
		this.increasing=increasing;
	} 
	
}
