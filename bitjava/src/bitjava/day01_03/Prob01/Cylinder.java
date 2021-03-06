package bitjava.day01_03.Prob01;

public class Cylinder extends Circle
{
	private double height;

	public static void main(String[] args)
	{

	}

	public Cylinder()
	{
		this.height = 1.0;
	}

	public Cylinder(double height)
	{
		this.height = height;
	}

	public Cylinder(double height, double radius)
	{
		this.height = height;
		setRadius(radius);
		setColor(getColor());
	}

	public Cylinder(double height, double radius, String color)
	{
		this.height = height;
		setRadius(radius);
		setColor(color);
	}

	public double getHeight()
	{
		return height;
	}

	public void setHeight(double height)
	{
		this.height = height;
	}

	@Override
	public String toString()
	{
		return "Cylinder [height=" + height + "]";
	}

	public double getVolume()
	{
		 // return Math.PI * super.getRadius()*super.getRadius()*height;
		return super.getArea() *height;
	}
}
