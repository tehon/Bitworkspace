package bitjava.day01_12;

import java.util.Scanner;

// 2017-01-12 (THU) 
// QWERTY Ű����. �� �հ��� �� ���� ������ �ϴ��� ����Ͽ� ���.
public class AdditionalProb05 {

	public static void main(String[] args) {
		// ���� ���� - �����迭
		char[][] keys = new char[8][];
		keys[0] = new char[] { '1', 'Q', 'A', 'Z' };
		keys[1] = new char[] { '2', 'W', 'S', 'X' };
		keys[2] = new char[] { '3', 'E', 'D', 'C' };
		keys[3] = new char[] { '4', '5', 'R', 'T', 'F', 'G', 'V', 'B' };
		keys[4] = new char[] { '6', '7', 'Y', 'U', 'H', 'J', 'N', 'M' };
		keys[5] = new char[] { '8', 'I', 'K', ',' };
		keys[6] = new char[] { '9', 'O', 'L', '.' };
		keys[7] = new char[] { '0', '-', '=', 'P', '[', ']', ';', '\'', '/' };
		int[] count = new int[8];
		
		// �Է�
		Scanner kb = new Scanner(System.in);
		System.out.print("�Է��ϼ��� : ");
		String strInput = kb.nextLine();
	
		// ī��Ʈ
		for(int i=0; i<strInput.length(); i++) {	// ���° ����
			for(int j=0; j<=7; j++) {				// ���° �հ���
				for(int k=0; k<=keys[j].length-1; k++) {
					if(keys[j][k] == strInput.toUpperCase().charAt(i)) {
						count[j]++;
					}
				}
			}
		}
		
		// ������
		System.out.print("��� : ");
		for(int i=0; i<=7; i++) 
			System.out.print( ((i==4)?" ":"") + count[i]);
		
		
	}
}