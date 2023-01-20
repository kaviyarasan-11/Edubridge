
public class TestAccount {

	public static void main(String[] args) {
		
		Account account = new Account();
		account.setAmount(0.0d);
		System.out.println("Current amount:"+account.getAmount());
		
		account.setDeposit(50000.00d);
		System.out.println("Deposit Amount is:"+account.getAmount());
		
		account.setDeposit(30000.00d);;
		System.out.println("Deposit Amount is:"+account.getAmount());
		System.out.println("You added amount is:"+account.getDeposit()); // print the only latest Added amount
		
		account.setDeposit(40000.00d);;
		System.out.println("Deposit Amount is:"+account.getAmount());
		System.out.println("You added amount is:"+account.getDeposit());
		
		account.setWithdraw(20000.00d);
		System.out.println("Amount you want to withdraw is:"+account.getWithdraw());
		System.out.println("Reamining Amount:"+account.getAmount());
		
		System.out.println(" Your account balance is:"+account.getAmount());
		
	}

}
