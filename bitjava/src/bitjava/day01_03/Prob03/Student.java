package bitjava.day01_03.Prob03;

public class Student extends Person
{
	private int numCourses;
	private String[] courses;
	private int[] grades;
	private static final int MAX_COURSES = 30;
	private static final int MAX_GRADES = 30;

	public static void main(String[] args)
	{

	}

	public Student(String name, String address)
	{
		super(name, address);
		numCourses = 0;
		courses = new String[MAX_COURSES];
		grades = new int[MAX_GRADES];

	}

	@Override
	public String toString()
	{
		return "Student : " + super.getName() + "( " + super.getAddress() + " )";
	}

	public void addCourseGrade(String course, int grade)
	{

	}

	public void printGrades()
	{
		System.out.println(this); //this.toString?
		for (int i = 0; i < numCourses; i++)
		{
			System.out.println(courses[i] + " : " + grades[i]);

		}
		System.out.println("average : " + getAverageGrade());
	}

	public double getAverageGrade()
	{
		int sum = 0; //
		for (int i = 0; i < numCourses; i++)
		{
			sum += grades[i];
		}
		return sum;
	}

}
