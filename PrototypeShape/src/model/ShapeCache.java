package model;

import java.util.HashMap;

public class ShapeCache {
	
	HashMap<String, Shape> shapeMap = new HashMap<String, Shape>();
	
	public ShapeCache() {};

	public HashMap<String, Shape> loadCache() {
		return shapeMap;
	}

	public Shape getShape(String id) {
		return shapeMap.get(id);
	}
	
	public void setShapeList(HashMap<String, Shape> shapeList) {
		this.shapeMap = shapeList;
	}
	
	public void addShape(String k, Shape s) {
		shapeMap.put(k, s);
	}
	
	
}
