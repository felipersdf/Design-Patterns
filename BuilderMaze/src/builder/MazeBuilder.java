package builder;

import model.Maze;

public abstract class MazeBuilder {
	
	protected Maze maze;
	 
    public MazeBuilder() {
        maze  = new Maze();
    }
    
    public abstract void buildWall();
 
    public abstract void buildRoom();
 
    public abstract void buildDoor();
    
    public void construirMazeBuilder() {
    	buildWall();
        buildRoom();
        buildDoor();
    }
 
    public Maze getMaze() {
        return maze;
    }

}