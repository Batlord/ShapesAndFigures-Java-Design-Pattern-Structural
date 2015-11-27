package fr.iutvalence.info.dut.m3105.preamble;

public class Circle implements Shape{

	public int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void draw(Position p) {
		
		System.out.println("Cercle en " + p + " de rayon " + this.radius);
		
	}
	

}
