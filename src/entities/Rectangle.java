package entities;

public class Rectangle {

	private double Width;
	private double Height;
	
	public double getWidth() {
		return this.Width;
	}
	
	public void setWidth(double width) {
		this.Width = width;
	}
	
	public double getHeight() {
		return this.Height;
	}
	
	public void setHeight(double height) {
		this.Height = height;
	}

	public double Area(){
		return this.Width*this.Height;
	}
	
	public double Perimeter(){
		return (this.Width*2)+(this.Height*2);
	}
	
	public double Diagonal() {
		return Math.sqrt(Math.pow(Width, 2)+Math.pow(Height, 2));
	}
}
