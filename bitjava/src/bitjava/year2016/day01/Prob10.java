package bitjava.year2016.day01;

public class Prob10 {

	public static void main(String[] args) {
		/*
		  for (int i = 2; i <= 100; i++) {
		 if (i % 2 == 0 || i % 3 == 0) {
		 if (i == 2 || i == 3) {
		 System.out.println(i);
		 }
		  } else {
		  System.out.println(i);
		  }
		  }
		 */

		/*
		 * for (int i = 2; i < 100; i++) { for (int j = 2; j < i-1; j++) {
		 * if(i%j==1){ System.out.println("�Ҽ�"+i+"   "+j); break; } } }
		 */

		/*
		 * for (int i = 2; i < 100; i++) { for (int j = 2; j < i-j; j++) {
		 * if(i%j==1){ System.out.println("�Ҽ�"+i+"   "+j); break; }
		 * 
		 * if(i==j){ System.out.println("=="+i+"   "+j); break; } } }
		 */

		
/*		for (int i = 2; i <= 100; i++) {
			for (int j = 2; j < i - j; j++) {
				if (i % j == 0) {
				
					break;

				} else {
					System.out.println(i);
					break;
				}
			}
		}*/
		
		//2�� �ȳ����� 11�� ������� ��Ͽ��� ������� �ʴ´�. 
		/*for (int i = 2; i <= 100; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
				
					break;

				} else {
					System.out.println(i);
					break;
				}
			}
		}*/
		
/*		int count=2;
		for (int j = 1; j < 100; j++) {
			if(count%j==0){
				System.out.println(j);
			}else{
				count++;
			}
			
		}
		*/
	/*	�Ǵ°�
	    for (int i = 2; i <= 100; i++) {
				 if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
				 if (i == 2 || i == 3|| i == 5) {
				 System.out.println(i);
				 }
				  } else {
				  System.out.println(i);
				  }
			  }*/
		  int count;
		  for (int i = 2; i <= 100; i++) {
			  count=0;
				 for (int j = 0; j <=i; j++) {
					if(i%j==0){
						count++;
					}
					if(count<=2){
						System.out.println("�Ҽ���");
					}
				}
			  }

	}

}