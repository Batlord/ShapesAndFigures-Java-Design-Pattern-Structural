package fr.iutvalence.info.dut.m3105.preamble;

public class Rectangle implements Shape{

	public int height;
	public int width;
	
	public Rectangle(int height, int width) {
		super();
		this.height = height;
		this.width = width;
	}

	@Override
	public void draw(Position p) {
		System.out.println("Rectangle en " + p + "de hauteur " + this.height + " et largeur " + this.width);
		
	}
	

}
