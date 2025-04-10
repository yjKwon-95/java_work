package ex05_enum;

public class WeekDayMain {
	public static void main(String[] args) {
		
		WeekDay today = WeekDay.SUNDAY;
		
		if(today == WeekDay.SUNDAY) {
			System.out.println("쉬는날 입니다.");
		} else {
			System.out.println("출근하는 날 입니다.");
		}
	}
}
