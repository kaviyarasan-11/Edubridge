
public class Account {
	private double Amount;
	private double depositAmount;
	private double withdrawAmount;
	
	public void setAmount(double Amount) {
		this.Amount = Amount;
	}
	public double getAmount() {
		return Amount;
	}
	public void setDeposit(double depositAmount) {
		this.depositAmount = depositAmount;
		this.Amount+=depositAmount;
	}
	public double getDeposit() {
		return depositAmount;
	}
	public void setWithdraw(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
		this.Amount-=withdrawAmount;
	}
	public double getWithdraw() {
		return withdrawAmount;
	}
	
}
