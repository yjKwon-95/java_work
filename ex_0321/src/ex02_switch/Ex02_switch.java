package ex02_switch;

public class Ex02_switch {
	public static void main(String[] args) {
		//switch문에 break가 없는 경우
		int num = 1;
		switch(num) {
		case 1:
			System.out.println("num은 1입니다.");
		case 7:
			System.out.println("num은 7입니다.");
		default:
			System.out.println("num은 1도 7도 아닙니다.");
		}
	}
}
