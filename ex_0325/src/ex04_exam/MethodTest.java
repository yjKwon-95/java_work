package ex04_exam;

import java.util.Random;

public class MethodTest {

	//배열의 최대값을 찾는 maxFinder메서드
	//임의의 배열은 매개변수로 받자.
	public void maxFinder(int[] arr) {
		int max = arr[0];
		for(int x : arr) {
			if(x > max) max = x;
		}
		
		System.out.println("최대값 : " + max);
	}
	
	//원의 넓이와 둘레 구하기
	//함수를 호출하면서 반지름을 받는다.
	//원의 넓이를 구하는 circleArea
	//원의 둘레를 구하는 circleRound
	//circleArea는 결과 출력하기
	//circleRound는 결과 반환하기
	//원의 넓이 : 3.14*r*r
	//원의 둘레 : 2*3.14*r;
	
	public void circleArea(int r) {
		System.out.println(3.14*r*r);
	}
	
	public double circleRound(int r) {
		return 2*3.14*r;
	}
	
	//계산기 만들기
	//사칙연산을 할 수 있는 calculator메서드 만들기
	//두 수와 연산자를 매개변수로 받는다.
	
	public void calculator(int x, int y, char op) {
		switch(op) {
		case '+':
			System.out.printf("%d + %d = %d\n",x,y,x+y);
			break;
		case '-':
			System.out.printf("%d - %d = %d\n",x,y,x-y);
			break;
		case '*':
			System.out.printf("%d * %d = %d\n",x,y,x*y);
			break;
		case '/':
			System.out.printf("%d / %d = %d\n",x,y,x/y);
			break;
		}
	}
	
	//1~50사이의 난수를 생성
	//main쪽에서 키보드를 통해 정수를 입력받는다.
	//check()메서드를 만들어서 사용자가 입력한 숫자를 판단.
	//발생한 난수보다 크다면 DOWN! 작다면 UP!을 출력
	//사용자가 입력한 숫자와 발생한 난수가 같을경우에 
	//프로그램을 종료(몇회만에 맞췄는지 판단해보자)
	
	int rnum = new Random().nextInt(50)+1;
	int count = 1;
	//사용자가 입력한 숫자와 난수를 체크하는 기능
	public int check(int number) {
		if(number == rnum) {
			return 0;
		} else if(number > rnum) {
			return 1;
		} else {
			return 2;
		}
	}
	
	
	
	
}






