package view;

import java.util.HashMap;

import model.*;

public class PatternShapeDemo {

	public static void main(String[] args) {
		ShapeCache shapeList = new ShapeCache();
		
		
		Shape shapeCircle = new Circle(); 
		shapeList.addShape("1", shapeCircle); //Criando Circulo sem Id
		
		Shape shapeRectangle = new Rectangle();
		shapeList.addShape("2", shapeRectangle); //Criando Retangulo sem Id
		
		Shape shapeSquare = new Square();
		shapeList.addShape("3", shapeSquare); //Criando Quadrado sem Id
		
		Shape shapeCircle2 = shapeCircle.clonar();
		shapeCircle2.setId("1");
		shapeList.addShape("4", shapeCircle2); //Clonando o circulo sem ID e setando um novo ID para o clone
		
		Shape shapeRec2 = shapeRectangle.clonar();
		shapeRec2.setId("2");
		shapeList.addShape("5", shapeRec2); //Clonando o retangulo sem ID e setando um novo ID para o clone
		
		Shape shapeSquare2 = shapeSquare.clonar();
		shapeSquare2.setId("3");
		shapeList.addShape("6", shapeSquare2); //Clonando o quadrado sem ID e setando um novo ID para o clone
		
		
//		System.out.println(shapeList.getShape("5"));
//		System.out.println(shapeList.getShape("2"));
//		System.out.println(shapeList.getShape("3"));
//		
		System.out.println(shapeList.loadCache());
		
		
		
		

	}

}
