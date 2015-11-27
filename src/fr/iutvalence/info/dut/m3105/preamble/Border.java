package fr.iutvalence.info.dut.m3105.preamble;

public class Border extends Shape{

	int thickness;
	Shape shape;
	public Border(int thickness, Shape shape) {
		super();
		this.thickness = thickness;
		this.shape = shape;
	}
	@Override
	public String toString() {
		return "Border [thickness=" + thickness + ", shape=" + shape + "]";
	}
	
	
}
