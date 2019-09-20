package model;

public abstract class AbstractMazeFactory {
	
	public abstract AbstractWall createWall();
	
	public abstract AbstractRoom createRoom();
	
	public abstract AbstractDoor createDoor();
	

}
