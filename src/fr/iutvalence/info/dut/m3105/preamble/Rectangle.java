package fr.iutvalence.info.dut.m3105.preamble;

public class Rectangle extends Shape{

	public int height;
	public int width;
	
	public Rectangle(int height, int width) {
		super();
		this.height = height;
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectangle de hauteur " + this.height + " et largeur " + this.width;
		
	}
	

}
