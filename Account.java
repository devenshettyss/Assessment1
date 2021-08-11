package assessment1;

public class Account {
	private int id;
	private Double balance;
	private String ownerName;
	private String createDate;
	private String type;
	private String status;
	public Account(int id, Double balance, String ownerName, String createDate, String type, String status) {
		super();
		this.id = id;
		this.balance = balance;
		this.ownerName = ownerName;
		this.createDate = createDate;
		this.type = type;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

}
