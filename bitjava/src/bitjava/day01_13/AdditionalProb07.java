package bitjava.day01_13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/* 2017-01-13 (FRI)
 * 

자바 문제7. 접미사(suffix)배열/LCP배열

접미사배열과 LCP배열을 출력하는 코드를 작성하세요.
접미사배열이란, 문자열 STR의 접미사들을 정렬해 놓은 배열입니다.
#	접미사
1	apple
2	pple
3	ple
4 	le
5	e

이를 접미사 순으로 정렬하면 아래와 같습니다.
#	접미사
1	apple
5	e
4	le
3	ple
2	pple

정렬된 #의 배열 [1,5,4,3,2]를 문자열 STR의 접미사배열이라 합니다.

LCP배열이란, 문자열 STR의 접미사배열을 구하여 정렬한 후,
바로 이전 접미사와의 LCP(Longest Common Prefix)의 길이를 배열에 담은 것.
위의 예에서 LCP 배열은 [x, 0, 0, 0, 1] 이 됩니다.

입력 : apple
출력 : x 0 0 0 1

입력 : banana
출력 : x 1 3 0 0 2

 */
public class AdditionalProb07 {
	public static final boolean SHOW_PROGRESS = true;
	public static void main(String[] args) {
		// 변수
		ArrayList<String> arrayList = new ArrayList<String>();
		ArrayList<Integer> arrayListResult = new ArrayList<Integer>();
		TreeSet<String> treeSet = new TreeSet<String>();

		// 입력
		Scanner kb = new Scanner(System.in);
		System.out.print("입력 : ");
		String strInput = kb.nextLine();
		
		// 접미사 배열
		for(int i=0; i<=strInput.length()-1; i++) {
			arrayList.add(strInput.substring(i));
			treeSet.add(strInput.substring(i));
		}
		
		// LCP(Longest Common Prefix) 배열
		Iterator itr = treeSet.iterator();
		String strPrevious = "";
		while(itr.hasNext()) {
			String strThis=(String) itr.next();
			if(SHOW_PROGRESS) System.out.println("  " +strThis);
			int nCount = 0;
			int nEnd = (strThis.length() > strPrevious.length()) ? strPrevious.length() : strThis.length();
			for(int i=0; i<=nEnd-1; i++) {
				if(strThis.charAt(i) == strPrevious.charAt(i)) nCount++;
				else break;
			}
			strPrevious = strThis;
			arrayListResult.add(nCount);
		}
		
		// 결과 출력
		System.out.print("결과 : ");
		for(int i=0; i<=arrayListResult.size()-1; i++) {
			System.out.print( ((i==0) ? "x" : arrayListResult.get(i)) + " " );
		}
	}
}


