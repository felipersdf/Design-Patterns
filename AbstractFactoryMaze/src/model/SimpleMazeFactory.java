package model;

public class SimpleMazeFactory extends AbstractMazeFactory{
	
	public AbstractRoom createRoom() {
		return new SimpleRoom();
	}

	public AbstractDoor createDoor() {
		return new SimpleDoor();
	}
	
	public AbstractWall createWall() {
		return new SimpleWall();
	}
	
}
