package exam1;

import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		//키보드에서 특수문자를 제외한 알파벳을 무작위로 받는다.
		//입력받은 문자열에서 소문자 a가 몇 개 있는지 판별하시오
		//예시
		//입력 : asdfasdf
		//결과 : 2
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String str = sc.next();
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'a') {
				count++;
			}
		}
		
		System.out.println("a의 개수 : " + count);
		
		//생일과 성별구하기
		//예시
		//주민번호를 모두 입력하세요(-포함)
		//911223-103345
		//당신은 1999년 12월 23일에 태어난 남자입니다.
		System.out.println("주민번호를 모두 입력하세요(-포함)");
		System.out.print(">> ");
		String id = sc.next();
		
		if(id.trim().length()<14 || id.trim().charAt(6)!= '-') {
			System.out.println("주민번홀를 올바르게 입력하세요");
		} else {
			String year = "";
			String result = "";
			
			year = id.substring(0,2);
			
			if(Integer.parseInt(year)<=25) {
				result = "당신은 20";
			} else {
				result = "당신은 19";
			}
			result += year+"년 "+ id.substring(2,4)+"월 "+ id.substring(4,6)+"일에 태어난 ";
			
			if(id.charAt(7) % 2 != 0) {
				result += "남자입니다.";
			} else {
				result += "여자입니다.";
			}
			
			System.out.println(result);
		}
		
		
		//회문 판별하기
		//앞으로 읽어도 뒤로 읽어도 똑같이 읽히는 문자열
		//키보드에서 문자열을 입력받아 회문이면 xxx는 회문입니다.
		//아니면 xxx는 회문이 아닙니다.
		//토마토는 회문입니다.
		//지하철은 회문이 아닙니다.
		
		System.out.print("문자열 입력 : ");
		String ori = sc.next();
		String rev = "";
		for(int i = ori.length()-1; i >= 0; i--) {
			rev += ori.charAt(i);
		}
		
		
		
		
		
		
		
		
	}
}
