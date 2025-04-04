package ex01_lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BiPredicate;
import java.util.function.Function;

class Greeting{
	private String name;
	
	public Greeting(String name) {
		this.name = name;
	}
	
	public String sayHello() {
		return "hello, " + name;
	}
}

class Student{
	private int score;
	
	public Student(int score) {
		this.score = score;
	}
	
	public boolean isPassed(int cutLine) {
		return score >= cutLine;
	}
}


public class Exam2 {
	public static void main(String[] args) {
		//Greeting메서드를 참조하여 sayHello() 호출하기
		
		Function<Greeting, String> greeter = Greeting::sayHello;
		
		Greeting g = new Greeting("홍길동");
		System.out.println(greeter.apply(g));
		
		//학생이 특정 점수 이상인지 확인하는 메서드를 메서드 참조로 구하기
		
		BiPredicate<Student, Integer> passChecker = Student::isPassed;
		
		Student s = new Student(85);
		System.out.println(passChecker.test(s, 70));
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		//removeIf()
		//조건에 맞으면 삭제해라
		list.removeIf(x -> x%2 == 0);
		
		System.out.println(list);
		
		
		
	}
}
