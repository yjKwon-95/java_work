package ex04_exam;

import java.util.Scanner;

public class MethodMain {
	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		
		int[] arr = {1,2,3,4,5};
		
		mt.maxFinder(arr);
		
		mt.circleArea(5);
		
		System.out.println(mt.circleRound(5));
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자 입력 : ");
			int answer = sc.nextInt();
			if(mt.check(answer) == 0){
				System.out.println(mt.count+"회 만에 정답입니다.");
				break;
			} else if(mt.check(answer) == 1) {
				System.out.println("Down!");
				mt.count++;
			} else {
				System.out.println("Up!");
				mt.count++;
			}
		}
		

		
		
		
		
		
		
		
		
		
	}
}
