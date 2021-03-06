package bitjava.day01_02.Prob02;

public class Point {
	private int x;
	private int y;

	public static void main(String[] args) {

	}

	public Point() {
		this.x = 0;
		this.y = 0; // y = 0;  둘중 어떤것이든 가능하긴 함
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String toString() {
		return "( " + x + " , " + y + " )";
	}

	public int[] getXY() {
		int[] arr = { x, y };
		return arr;
	}

	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public double distance() {
		return Math.sqrt(x * x + y * y);
	}

	public double distance(Point another) {
		int dx = this.x - another.x;
		int dy = this.y - another.y;
		return Math.sqrt(dx * dx + dy * dy);
	}

	public double distance(int x, int y) {
		//거리 구하는 식
		int dx = this.x - x;
		int dy = this.y - y;

		return Math.sqrt(dx * dx + dy * dy);
	}

}
