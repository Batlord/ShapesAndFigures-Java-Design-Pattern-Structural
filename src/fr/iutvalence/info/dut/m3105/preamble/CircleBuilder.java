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
		this.thickness = thickness;
		this.shape = shape;
	}
	
	public CircleBuilder setFill(int angle, int intensity, Shape shape){
		this.angle = angle;
		this.intensity = intensity;
		this.shape = shape;
	}
	

}
