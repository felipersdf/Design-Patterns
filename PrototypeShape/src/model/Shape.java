package model;

public abstract class Shape {
	
	protected String id;
	protected String type;
	
	public abstract Shape clonar();
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}

	public String toString() {
		return "Shape: \n Id:" + id + "\n Type:" + type + "\n\n";
	}
	
}
