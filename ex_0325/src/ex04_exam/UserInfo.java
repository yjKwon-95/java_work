package ex04_exam;

public class UserInfo {

	int money; //계좌
	
	//입금
	public void deposit(int money) {
		System.out.println("입금 성공");
		this.money += money;
	}
	
	//출금
	public void withdraw(int money) {
		if(this.money < money) {
			System.out.println("잔액부족");
		}else {
			System.out.println("출금성공");
			this.money -= money;
		}
	}
	
	//잔액조회
	public int showMoney() {
		return money;
	}
	
	
	
	
}
