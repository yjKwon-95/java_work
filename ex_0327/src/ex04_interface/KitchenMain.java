package ex04_interface;

public class KitchenMain {
	public static void main(String[] args) {
		//인터페이스는 객체를 직접 생성할 수 없다.
		//인터페이스를 구현한 클래스의 객체를 생성한다.
		Kitchen k = new Kitchen();
		System.out.println("자장면 : " + k.jajang());
		System.out.println("짬뽕 : " + k.JJamBBong());
		
		//부모타입으로 자동 타입변환을 할 수 있다.
		//부모타입으로부터 만들어진 메서드만 사용할 수 있다.
		Menu1 m1 = new Kitchen();
		System.out.println("자장면 : " + m1.jajang());
		System.out.println("짬뽕 : " + m1.JJamBBong());
		
		Menu2 m2 = new Kitchen();
		System.out.println("자장면 : " + m2.jajang());
		System.out.println("짬뽕 : " + m2.JJamBBong());
	}
}

//추상클래스와 인터페이스의 차이점
//개념적 목적
//추상클래스 : 상속받아서 기능을 확장시키는데 목적
//ㄴ상속받은거 + 자식의 기능을 작성
//인터페이스는 : 구현 객체의 동일한 실행 기능을 보장하기위한 목적
//ㄴ구현한 클래스는 온전히 인터페이스의 기능을 갖추었음을 보장

//인터페이스 사용 예
//1. 어플리케이션의 기능을 정의해야 하지만 그 구현방식이나 대상에 대해 추상화 할 때
//2. 서로 관련성이 없는 클래스들을 묶어주고 싶을 때 
//3. 다중 상속을 통한 추상화 설계를 해야할 때
//4. 특정 데이터 타입의 행동을 명시할 때, 어디서 그 행동이 구현되는지
//특정하지 않았을 때
//5. 클래스와 별도로 구현 객체가 같은 동작을 한다는 것을 보장할 때 







