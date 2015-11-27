package fr.iutvalence.info.dut.m3105.preamble;

public class Shadow extends Shape{

	int angle;
	int intensity;
	Shape shape;
	public Shadow(int angle, int intensity, Shape shape) {
		super();
		this.angle = angle;
		this.intensity = intensity;
		this.shape = shape;
	}
	@Override
	public String toString() {
		return "Shadow [angle=" + angle + ", intensity=" + intensity
				+ ", shape=" + shape + "]";
	}
	
	
	
}
