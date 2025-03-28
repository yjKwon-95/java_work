package ex01_innerClass;

interface buttonClickListner{
	public void click();
}

public class AnonymousExample {
	public class Button{
		private buttonClickListner listener;
		
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
		AnonymousExample exam = new AnonymousExample();
		AnonymousExample.Button button = exam.new Button();
		button.setListener(new buttonClickListner() {
			@Override
			public void click() {
				System.out.println("버튼 클릭됨");
			}
		});
		
		button.click();
	}
	
	
	
	
	
	
}






