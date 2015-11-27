package fr.iutvalence.info.dut.m3105.preamble;

public class Position {
	
	int x;
	int y;
	
	
	public Position(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Position [x=" + x + ", y=" + y + "]";
	}

}
