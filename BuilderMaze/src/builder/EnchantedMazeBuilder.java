package builder;

public class EnchantedMazeBuilder extends MazeBuilder {

	public EnchantedMazeBuilder() {}

	public void buildWall() {
       maze.setWall("Enchanted Wall");
    }
 
    public void buildDoor() {
       maze.setDoor("Enchanted Door");
    }
 
    public void buildRoom() {
       maze.setRoom("Enchanted Room");
    }
 

}

