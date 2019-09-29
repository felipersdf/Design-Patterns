package model;

public class Rectangle extends Shape{

	protected Rectangle(Rectangle retangulo) {
		this.type = retangulo.getType();
	}
	public Rectangle() {
		type = "Rectangle";
	}

	public Shape clonar() {
		return new Rectangle(this);
	}

}
