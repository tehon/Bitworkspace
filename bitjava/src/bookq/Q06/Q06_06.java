package bookq.Q06;

public class Q06_06
{

	public static void main(String args[])
	{
		System.out.println(getDistance(1, 1, 2, 2));
	}

	// (x,y) (x1,y1) . 두 점 와 간의 거리를 구한다
	static double getDistance(int x1, int y1, int x2, int y2)
	{

		double result = Math.sqrt(Math.abs((x1 - x2) * (y1 - y2)));
		return result;

	}

}
