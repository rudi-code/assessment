package id.co.multisoft.entity;

public class UnusualEventCViewModel {
	private int id;
	private UnusualEventA unusualEventA;
	private UnusualEventB unusualEventB;
	private String created_date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public UnusualEventA getUnusualEventA() {
		return unusualEventA;
	}
	public void setUnusualEventA(UnusualEventA unusualEventA) {
		this.unusualEventA = unusualEventA;
	}
	public UnusualEventB getUnusualEventB() {
		return unusualEventB;
	}
	public void setUnusualEventB(UnusualEventB unusualEventB) {
		this.unusualEventB = unusualEventB;
	}
	public String getCreated_date() {
		return created_date;
	}
	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UnusualEventCViewModel [id=");
		builder.append(id);
		builder.append(", unusualEventA=");
		builder.append(unusualEventA);
		builder.append(", unusualEventB=");
		builder.append(unusualEventB);
		builder.append(", created_date=");
		builder.append(created_date);
		builder.append("]");
		return builder.toString();
	}
	
}
