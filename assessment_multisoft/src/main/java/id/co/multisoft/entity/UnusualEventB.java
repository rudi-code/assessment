package id.co.multisoft.entity;

import java.sql.Date;

public class UnusualEventB {
	
	private int id;
	private String object;
	private String object_type;
	private String video_url;
	private String timeStamp;
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
	public String getObject_type() {
		return object_type;
	}
	public void setObject_type(String object_type) {
		this.object_type = object_type;
	}
	public String getVideo_url() {
		return video_url;
	}
	public void setVideo_url(String video_url) {
		this.video_url = video_url;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UnusualEventB [id=");
		builder.append(id);
		builder.append(", object=");
		builder.append(object);
		builder.append(", object_type=");
		builder.append(object_type);
		builder.append(", video_url=");
		builder.append(video_url);
		builder.append(", timeStamp=");
		builder.append(timeStamp);
		builder.append("]");
		return builder.toString();
	}
	

}
