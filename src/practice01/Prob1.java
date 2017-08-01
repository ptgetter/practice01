package practice01;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {

		System.out.print("수를 입력하시오 : ");
		Scanner scan = new Scanner(System.in);
		int inputNumber = scan.nextInt();
		scan.close();
		
		if(inputNumber % 3 == 0) {
			System.out.println("3의 배수 입니다.");			
		}
		else {
			System.out.println("3의 배수가 아닙니다.");
		}
			
	}
}
