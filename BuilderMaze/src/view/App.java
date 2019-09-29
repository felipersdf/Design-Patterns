package view;

import builder.*;
import model.*;

public class App {

	public static void main(String[] args) {
		WizardMazeCreator wizard = new WizardMazeCreator(new EnchantedMazeBuilder());
		wizard.construirMaze();
		
		Maze maze = wizard.getMaze();
		System.out.println(maze);
		
		System.out.println("\n");
		
		
		wizard = new WizardMazeCreator(new SimpleMazeBuilder());
		wizard.construirMaze();
		maze = wizard.getMaze();
		System.out.println(maze);
		
	}

}
