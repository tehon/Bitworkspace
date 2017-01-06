package bitjava.day01_06;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterStream
{

	public static void main(String[] args) throws IOException
	{
		PrintWriter out = new PrintWriter(new FileWriter("Printf.txt"));
		out.printf("오늘은 %d/%d(%c) %s 마지막 날", 1, 6, '금', "java args");

		out.println();
		
		out.print("수고요");
		out.close();
	}

}
