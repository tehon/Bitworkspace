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
		 * if(i%j==1){ System.out.println("소수"+i+"   "+j); break; } } }
		 */

		/*
		 * for (int i = 2; i < 100; i++) { for (int j = 2; j < i-j; j++) {
		 * if(i%j==1){ System.out.println("소수"+i+"   "+j); break; }
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
		
		//2가 안나오고 11의 배수들이 목록에서 사라지지 않는다. 
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
	/*	되는거
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
						System.out.println("소수임");
					}
				}
			  }

	}

}
