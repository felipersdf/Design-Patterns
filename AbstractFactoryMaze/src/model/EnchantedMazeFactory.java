package model;

public class EnchantedMazeFactory extends AbstractMazeFactory {
	
	public AbstractRoom createRoom() {
		return new EnchantedRoom();
	}

	public AbstractDoor createDoor() {
		return new EnchantedDoor();
	}
	
	public AbstractWall createWall() {
		return new EnchantedWall();
	}
	
}
