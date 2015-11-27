package fr.iutvalence.info.dut.m3105.preamble;

public class PreambleApplication
{
	public static void main(String[] args)
	{
		 Shape circle = new Circle(4);
		 Shape circle2 = new SolidFill(3, circle);
		 Shape circle3 = new Border(1, circle2);
		 Shape circle4 = new Shadow(5, 9, circle3);
		 Shape rectangle = new Rectangle(2, 3);
		 Shape rectangle2 = new SolidFill(2, rectangle);
		 Shape rectangle3 = new Border(3, rectangle2);
		 Shape rectangle4 = new Shadow(4, 8, rectangle3);
		 Position positionCercle = new Position(0, 0);
		 Position positionRectangle = new Position(2, 2);
		 circle4.draw(positionCercle);
		 rectangle4.draw(positionRectangle);
	}

}
