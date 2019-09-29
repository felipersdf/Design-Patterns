package model;

import builder.MazeBuilder;

public class WizardMazeCreator {

	protected MazeBuilder spell;

	public WizardMazeCreator(MazeBuilder spell) {
		this.spell = spell;
	}

	public void construirMaze() {
		spell.buildDoor();
		spell.buildRoom();
		spell.buildWall();

		//spell.construirCarroBuilder();
	}

	public Maze getMaze() {
		return spell.getMaze();
	}
}


