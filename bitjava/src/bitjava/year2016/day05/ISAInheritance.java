package bitjava.year2016.day05;

public class ISAInheritance
{

	public static void main(String[] args)
	{
		Notebook nc = new Notebook("A", 5);
		TabletNotebook tn = new TabletNotebook("B", 5, "ISED@=");

		nc.movingCal();
		tn.write("ISED@=");
		tn.write("dkanakf");
	}

}

class Computer
{
	String owner;

	public Computer(String name)
	{
		owner = name;
	}

	public void calculate()
	{
		System.out.println("계산합니다");
	}

}

class Notebook extends Computer
{
	int battery;

	public Notebook(String name, int initChag)
	{
		super(name);
		battery = initChag;
	}

	public void charging()
	{
		battery += 5;

	}

	public void movingCal()
	{
		System.out.println("이동중");
		calculate();
		battery -= 1;
	}

}

class TabletNotebook extends Notebook
{
	String pen;

	public TabletNotebook(String name, int initChag, String pen)
	{
		super(name, initChag);
		this.pen = pen;
	}

	public void write(String penInfo)
	{
		if (pen.compareTo(penInfo) != 0)
		{
			System.out.println("등록된 펜이 아님");
			return;
		}
		System.out.println("필기내용 처리");
		battery -= 1;
	}

}