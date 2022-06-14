package id.co.multisoft.entity;

import java.sql.Date;

public class UnusualEventA {
	
	private int id;
	private String object;
	private String event_type;
	private String video_link;
	private boolean is_alert;
	private String time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getObject() {
		return object;
	}
	public void setObject(String object) {
		this.object = object;
	}
	public String getEvent_type() {
		return event_type;
	}
	public void setEvent_type(String event_type) {
		this.event_type = event_type;
	}
	public String getVideo_link() {
		return video_link;
	}
	public void setVideo_link(String video_link) {
		this.video_link = video_link;
	}
	public boolean isIs_alert() {
		return is_alert;
	}
	public void setIs_alert(boolean is_alert) {
		this.is_alert = is_alert;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UnusualEventA [id=");
		builder.append(id);
		builder.append(", object=");
		builder.append(object);
		builder.append(", event_type=");
		builder.append(event_type);
		builder.append(", video_link=");
		builder.append(video_link);
		builder.append(", is_alert=");
		builder.append(is_alert);
		builder.append(", time=");
		builder.append(time);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
