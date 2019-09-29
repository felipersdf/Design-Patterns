package model;

public class Circle extends Shape {

	protected Circle(Circle circulo) {
		this.type = circulo.getType();
	}
	public Circle() {
		type = "Circle";
	}

	public Shape clonar() {
		return new Circle(this);
	}

}

