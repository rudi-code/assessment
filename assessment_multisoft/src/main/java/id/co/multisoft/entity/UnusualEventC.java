package id.co.multisoft.entity;

import java.sql.Date;

public class UnusualEventC {
	
	private int id;
	private Integer id_unusual_event_a;
	private Integer id_unusual_event_b;
	private String created_date;
	
	/*INISIATE TO STRING*/
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UnusualEventC [id=");
		builder.append(id);
		builder.append(", id_unusual_event_a=");
		builder.append(id_unusual_event_a);
		builder.append(", id_unusual_event_b=");
		builder.append(id_unusual_event_b);
		builder.append(", created_date=");
		builder.append(created_date);
		builder.append("]");
		return builder.toString();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getId_unusual_event_a() {
		return id_unusual_event_a;
	}

	public void setId_unusual_event_a(Integer id_unusual_event_a) {
		this.id_unusual_event_a = id_unusual_event_a;
	}

	public Integer getId_unusual_event_b() {
		return id_unusual_event_b;
	}

	public void setId_unusual_event_b(Integer id_unusual_event_b) {
		this.id_unusual_event_b = id_unusual_event_b;
	}

	public String getCreated_date() {
		return created_date;
	}

	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}
	
	
	
	
	
	
	

}
