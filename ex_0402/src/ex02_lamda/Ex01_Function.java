package ex02_lamda;

import java.util.Arrays;

public class Ex01_Function {
	public static void main(String[] args) {
		//Iadd를 구현한 구현체는 다 대입이 가능하다.
		
		Iadd add = (x,y) -> x + y;
		
		
	
	};
	
	
	public static int result(Iadd lamda) {
		return lamda.add(1, 2);
	}

}
