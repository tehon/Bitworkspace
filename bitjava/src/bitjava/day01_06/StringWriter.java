package bitjava.day01_06;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StringWriter
{

	public static void main(String[] args) throws IOException
	{
		BufferedWriter out = new BufferedWriter(new FileWriter("String.txt"));

		out.write("ù°�� ���ڿ�");
		out.newLine();
		out.write("second char");

		out.close();
		System.out.println("�Է¿Ϸ�");
	}

}