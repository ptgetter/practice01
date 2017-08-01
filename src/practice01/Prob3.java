package practice01;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		while( true ) {
			System.out.print("숫자를 입력하시오(종료는 -1) : ");
			
			int inputNumber = scan.nextInt();
			if(inputNumber < 0) {
				break;
			}
			
			int sum = 0;
			
			for(int i=inputNumber; i>0; i = i -2) {
				sum += i;
			}
			
			System.out.printf("결과값 : %d\n", sum);
		}
		
		System.out.println("종료.");
		scan.close();
	}
}