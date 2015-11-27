package fr.iutvalence.info.dut.m3105.preamble;


public class SolidFill extends Shape{

	int color;
	Shape shape;
	public SolidFill(int color, Shape shape) {
		super();
		this.color = color;
		this.shape = shape;
	}
	@Override
	public String toString() {
		return "SolidFill [color=" + color + ", shape=" + shape + "]";
	}
	

}
