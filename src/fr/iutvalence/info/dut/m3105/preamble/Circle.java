package fr.iutvalence.info.dut.m3105.preamble;

public class Circle extends Shape{

	public int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	public String toString() {
		
		return "Cercle de rayon " + this.radius;
		
	}
	

}
