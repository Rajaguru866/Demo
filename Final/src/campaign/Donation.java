package campaign;

public class Donation {
	
	public String name,mailid,date;
	public long mobno;
	int amount;
	public Donation(String name, String mailid, long mobno, String date, int amount) {
		super();
		this.name = name;
		this.mailid = mailid;
		this.mobno = mobno;
		this.date = date;
		this.amount = amount;
	}
	public Donation() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public long getMobno() {
		return mobno;
	}
	public void setMobno(long mobno) {
		this.mobno = mobno;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	

}
