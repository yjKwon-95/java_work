package ex04_while;

import java.util.Scanner;

public class Ex02_do_while {
	public static void main(String[] args) {
		//while문과 같이 조건을 만족할 때까지 반복한다.
		//다만, while문과 다른 점은 먼저 루프를 한 번 실행한 후
		//조건식을 검사한다는 점이다.
		//즉, 조건식의 결과와 상관없이 무조건 한 번은 실행한다.
		
		//do{
		//	반복하고자 하는 명령
		//}while(조건식)
		
		int i = 11;
		do {
			System.out.println(i);
		}while(i<=10);
		
		//1 ~ 10까지의 총합 구하기
	
		//메서드를 사용하기 위한 Scanner객체 생성
		Scanner sc = new Scanner(System.in);
		
		
		
		//비밀번호 확인 프로그램 만들기
		//사용자로부터 비밀번호를 입력받아 올바른 비밀번호가 
		//입력될때까지 계속 입력을 요구하는 프로그램 만들기
		//비밀번호는 9486
		int pw = 9486;
		int answer = 0;
		boolean isAnswer = false;
		do {
			System.out.print("비밀번호 입력 : ");
			 answer = sc.nextInt();
			
			if(pw == answer) {
				System.out.println("비밀번호가 맞습니다.");
				isAnswer = true;
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
			
		}while(!isAnswer);//비밀번호가 맞지 않으면 다시 반복해야함
		
//		비밀번호를 입력하세요: 1234
//		비밀번호가 틀렸습니다. 다시 입력하세요.
//		비밀번호를 입력하세요: 1111
//		비밀번호가 틀렸습니다. 다시 입력하세요.
//		비밀번호를 입력하세요: 9486
//		접속 성공!
		
		
		//학생의 국어, 영어, 수학 점수를 입력받는다.
		//단, 각 과목은 40점 이상이어야 하며,
		//40점 미만이면 과목 점수를 다시 입력받아야 한다.
		
		int kor,eng,math = 0;
		
		do {
			System.out.print("국어 점수 : ");
			kor = sc.nextInt();
			System.out.print("영어 점수 : ");
			eng = sc.nextInt();
			System.out.print("수학 점수 : ");
			math = sc.nextInt();
		}while(kor < 40 || eng < 40 || math < 40);
		
		
		
		
		
	}
}
