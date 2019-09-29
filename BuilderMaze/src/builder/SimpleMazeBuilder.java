package builder;

public class SimpleMazeBuilder extends MazeBuilder{

	public SimpleMazeBuilder() {};

	public void buildWall() {
		maze.setWall("Wall");
	}

	public void buildDoor() {
		maze.setDoor("Door");
	}

	public void buildRoom() {
		maze.setRoom("Room");
	}

}
