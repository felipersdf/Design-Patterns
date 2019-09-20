package model;

public class Maze {
	
	private AbstractRoom room;
	private AbstractDoor door;
	private AbstractWall wall;
	
	
	public AbstractRoom getRoom() {
		return room;
	}
	public void setRoom(AbstractRoom room) {
		this.room = room;
	}
	public AbstractDoor getDoor() {
		return door;
	}
	public void setDoor(AbstractDoor door) {
		this.door = door;
	}
	public AbstractWall getWall() {
		return wall;
	}
	public void setWall(AbstractWall wall) {
		this.wall = wall;
	}
	public String toString() {
		return "\n Room-> " + room + "\n Door-> " + door + "\n Wall-> "+wall+"\n";
	}
	
	
	
}
