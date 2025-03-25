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
		
//		Graph라는 이름의 메인 클래스를 만들어 
		//0 ~ 9사이의 난수를 100개 저장하는 배열을 만들고, 
		//해당 배열이 가지고 있는 각 방의 난수를 판별하여 그래프화 해 보자.
//
//		단, 발생한 난수의 그래프화 작업은 PrintGraph클래스가 하도록 한다.
//
//		결과:
//		0507...... //난수 100개
//		0의 갯수 : ############ 12
//		1의 갯수 : ######### 9
//		2의 갯수 : ########### 11
//		3의 갯수 : ######## 8
//		4의 갯수 : ############## 14
//		5의 갯수 : ####### 7
//		6의 갯수 : ######### 9
//		7의 갯수 : ############# 13
//		8의 갯수 : ####### 7
//		9의 갯수 : ########## 10
		
		
		
		
		
		
		
		
		
	}
}
