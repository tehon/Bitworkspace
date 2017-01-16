package bitjava.day01_13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/* 2017-01-13 (FRI)
 * 

�ڹ� ����7. ���̻�(suffix)�迭/LCP�迭

���̻�迭�� LCP�迭�� ����ϴ� �ڵ带 �ۼ��ϼ���.
���̻�迭�̶�, ���ڿ� STR�� ���̻���� ������ ���� �迭�Դϴ�.
#	���̻�
1	apple
2	pple
3	ple
4 	le
5	e

�̸� ���̻� ������ �����ϸ� �Ʒ��� �����ϴ�.
#	���̻�
1	apple
5	e
4	le
3	ple
2	pple

���ĵ� #�� �迭 [1,5,4,3,2]�� ���ڿ� STR�� ���̻�迭�̶� �մϴ�.

LCP�迭�̶�, ���ڿ� STR�� ���̻�迭�� ���Ͽ� ������ ��,
�ٷ� ���� ���̻���� LCP(Longest Common Prefix)�� ���̸� �迭�� ���� ��.
���� ������ LCP �迭�� [x, 0, 0, 0, 1] �� �˴ϴ�.

�Է� : apple
��� : x 0 0 0 1

�Է� : banana
��� : x 1 3 0 0 2

 */
public class AdditionalProb07 {
	public static final boolean SHOW_PROGRESS = true;
	public static void main(String[] args) {
		// ����
		ArrayList<String> arrayList = new ArrayList<String>();
		ArrayList<Integer> arrayListResult = new ArrayList<Integer>();
		TreeSet<String> treeSet = new TreeSet<String>();

		// �Է�
		Scanner kb = new Scanner(System.in);
		System.out.print("�Է� : ");
		String strInput = kb.nextLine();
		
		// ���̻� �迭
		for(int i=0; i<=strInput.length()-1; i++) {
			arrayList.add(strInput.substring(i));
			treeSet.add(strInput.substring(i));
		}
		
		// LCP(Longest Common Prefix) �迭
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
		
		// ��� ���
		System.out.print("��� : ");
		for(int i=0; i<=arrayListResult.size()-1; i++) {
			System.out.print( ((i==0) ? "x" : arrayListResult.get(i)) + " " );
		}
	}
}

