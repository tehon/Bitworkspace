package bitjava.day01_12;

import java.util.Scanner;

// 2017-01-12 (THU) 
// QWERTY 키보드. 각 손가락 몇 번씩 눌러야 하는지 계산하여 출력.
public class AdditionalProb05 {

	public static void main(String[] args) {
		// 변수 셋팅 - 가변배열
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
		
		// 입력
		Scanner kb = new Scanner(System.in);
		System.out.print("입력하세요 : ");
		String strInput = kb.nextLine();
	
		// 카운트
		for(int i=0; i<strInput.length(); i++) {	// 몇번째 글자
			for(int j=0; j<=7; j++) {				// 몇번째 손가락
				for(int k=0; k<=keys[j].length-1; k++) {
					if(keys[j][k] == strInput.toUpperCase().charAt(i)) {
						count[j]++;
					}
				}
			}
		}
		
		// 결과출력
		System.out.print("결과 : ");
		for(int i=0; i<=7; i++) 
			System.out.print( ((i==4)?" ":"") + count[i]);
		
		
	}
}
