package bitjava.day01_02.Prob02;

public class Circle {
	private Point center;
	private double radius;

	public static void main(String[] args) {

	}

	// Circle()
	public Circle() {
		this.center = new Point(); // new Point(0, 0);
		this.radius = 1.0;
	}

	public Circle(int xCenter, int yCenter, double radius) {
		this.center = new Point(xCenter, yCenter);
		this.radius = radius;
	}

	public Circle(Point center, double radius) {
		this.center = center;
		this.radius = radius;
	}

	// getCenter()
	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	// getRadius()
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	// getCenterX()
	public int getCenterX() {
		return center.getX();
	}

	public void setCenterX(int x) {
		this.center.setX(x);
	}

	// getCenterY()
	public int getCenterY() {
		return center.getY();
	}

	public void setCenterY(int y) {
		this.center.setY(y);
	}

	// getCenterXY()
	public int[] getCenterXY() {
		return center.getXY();
	}

	public void setCenterXY(int x, int y) {
		this.center.setXY(x, y);
	}

	// toString()
	@Override
	public String toString() {
		return "Circle [center=" + center + ", radius=" + radius + "]";
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	public double GetCircumference() {
		return 2 * Math.PI * radius;
	}

	public double distance(Circle another) {
		return center.distance(another.center);
	}
}
