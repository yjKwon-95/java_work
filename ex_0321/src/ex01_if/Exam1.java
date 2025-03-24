package ex01_if;

public class Exam1 {
	public static void main(String[] args) {
		//삼항연산자로 만들었던 X개의 농구공을 담기 위한
		//박스의 개수 구하기
		int ball = 23;
		int box = 0;
		if(ball % 5 == 0) {
			box = ball/5;
			System.out.printf("필요한 박스의 개수는 %d개입니다.\n",box);
		} else {
			box = ball/5 + 1;
			System.out.printf("필요한 박스의 개수는 %d개입니다.\n",box);
		}
		
	}
}
