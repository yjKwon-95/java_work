package exam2;

public class HouseMain {
	public static void main(String[] args) {
		House h = new House();
		
		//각 구성원 객체가 부모타입으로 들어옴
		h.member1 = new Father();
		h.member2 = new Mother();
		h.member3 = new Pet();
		
		//부모타입으로 변했기 때문에 Father클래스에
		//정의된 필드는 사용하지 못함
		System.out.println(h.member1.bed);
		System.out.println(h.member1.desk);
		
		//자식 클래스에 정의된 필드나 메서드를 사용하려면
		//강제로 자식타입으로 변환을 해야한다.
		System.out.println(((Father)h.member1).beard);
		
		
		
		
		
		
		
		
		
		
	}
}
