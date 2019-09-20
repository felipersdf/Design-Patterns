package view;

import model.AbstractMazeFactory;
import model.EnchantedMazeFactory;
import model.Maze;
import model.SimpleMazeFactory;


public class MazeGame {
	
	private static Maze createMaze(int mazeType) {
		AbstractMazeFactory mazeFactory = null;
		
		if(mazeType == 1) {
			mazeFactory = new SimpleMazeFactory();
		} else if(mazeType == 2) {
			mazeFactory = new EnchantedMazeFactory();
		}
		
		Maze maze = new Maze();
		maze.setDoor(mazeFactory.createDoor());
		maze.setRoom(mazeFactory.createRoom());
		maze.setWall(mazeFactory.createWall());
		
		return maze;
		
	}
	
	public static void main(String[] args){
		Maze m1 = createMaze(1);
		Maze m2 = createMaze(2);
		
		System.out.println("Simples: "+m1);
		System.out.println("Encantado: "+m2);
	}

	
}
