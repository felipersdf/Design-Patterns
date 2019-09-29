package model;

public class Square extends Shape {

	protected Square(Square quadrado) {
		this.type = quadrado.getType();
	}
	public Square() {
		type = "Square";
	}

	public Shape clonar() {
		return new Square(this);
	}

}
