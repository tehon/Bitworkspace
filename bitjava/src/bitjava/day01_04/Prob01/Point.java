package bitjava.day01_04.Prob01;

public class Point
{
	int x;
	int y;
	int xy;

	public Point(int x1, int y1)
	{
		// TODO Auto-generated constructor stub
	}

	public int getX()
	{
		return x;
	}

	public void setX(int x)
	{
		this.x = x;
	}

	public int getY()
	{
		return y;
	}

	public void setY(int y)
	{
		this.y = y;
	}

	public double distance(Point end)
	{
		return Math.sqrt(getX() + getX() * getY() + getY());
	}

	public void setXY(int x, int y)
	{
		this.xy = x * y;
	}

	public int[] getXY()
	{
		return null;
	}

}
