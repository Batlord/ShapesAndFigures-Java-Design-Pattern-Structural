package fr.iutvalence.info.dut.m3105.preamble;

public class PreambleApplication
{
	public static void main(String[] args)
	{
		 Circle circle = new Circle(4);
		 Rectangle rectangle = new Rectangle(2, 3);
		 Position positionCercle = new Position(0, 0);
		 Position positionRectangle = new Position(2, 2);
		 circle.draw(positionCercle);
		 rectangle.draw(positionRectangle);
	}

}
