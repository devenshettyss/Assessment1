package assessment1;

public class CurrentAccount extends Account{
	private double overDraftBalance;
	public CurrentAccount(int id , double balance, String ownerName, String createDate, String type, String status, double overDraftBalance) {
		super(id, balance, ownerName, createDate, type, status);
		this.overDraftBalance = overDraftBalance; 
	}
	
	public double getOverDraftBalance() {
		return overDraftBalance;
	}
	

}
