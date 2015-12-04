package fr.iutvalence.info.dut.m3105.preamble;

public class CircleBuilder {
	
	private Shape current;
	
	public CircleBuilder(int radius){
		current = new Circle(radius);
	}
	
	public CircleBuilder setColor(int color, Shape shape){
		current = new SolidFill(color, current);
		return this;
	}
	
	public CircleBuilder setThicker(int thickness, Shape shape){
		current = new Border(thickness, current);
		return this;
	}
	
	public CircleBuilder setFill(int angle, int intensity, Shape shape){
		current = new Shadow(angle, intensity, current);
		return this;
	}
	

}
