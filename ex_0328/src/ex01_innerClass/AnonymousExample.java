package ex01_innerClass;

//인터페이스를 생성
interface buttonClickListner{
	//추상메서드를 생성
	abstract public void click();
}

public class AnonymousExample {
	//내부클래스
	public class Button{
		//buttonClickListener 타입의 변수를 가진다.
		//인터페이스의 구현체는 다 들어올 수 있다.
		private buttonClickListner listener;
		
		//멤버변수는 private으로 지정하는 일이 많기 때문에 직접 접근하는것이 불가능하다.
		//public으로 된 메서드를 통해서 접근을 하는일이 많다.
		//setter & getter
		
		public void setListener(buttonClickListner listener) {
			this.listener = listener;
		}
		
		public void click() {
			if(listener != null) {
				this.listener.click();
			}
		}
	}
	
	public static void main(String[] args) {
		//외부 클래스의 객체
		AnonymousExample exam = new AnonymousExample();
		//내부 클래스의 객체(외부 클래스의 객체로부터 생성)
		AnonymousExample.Button button = exam.new Button();
		
		//
		
		button.setListener(new buttonClickListner() {
			@Override
			public void click() {
				System.out.println("버튼 클릭됨");
			}
		});
		
		button.click();
	}
	
	
	
	
	
	
}






