package ex06_List;

import java.util.ArrayList;
import java.util.Scanner;

class MenuItem{
	private String name;
	private int price;
	
	public MenuItem(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}



public class CafeApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<MenuItem> menuList = new ArrayList<>();
		ArrayList<MenuItem> orderList = new ArrayList<>();
		
		menuList.add(new MenuItem("아메리카노",3000));
		menuList.add(new MenuItem("라떼",3500));
		menuList.add(new MenuItem("카푸치노",4000));
		
		boolean running = true;
		
		while(running) {
			System.out.println("\n===카페 주문 시스템===");
			System.out.println("1. 메뉴 보기");
			System.out.println("2. 메뉴 추가");
			System.out.println("3. 결제 하기");
			System.out.println("4. 종료 하기");
			System.out.println("5. 취소 하기");
			System.out.print("번호 선택 : ");
			int choice = sc.nextInt();
		
			switch(choice) {
			case 1:
				//menuList에 들어있는 내용을 꺼내서 보여주기
				System.out.println("[메뉴판]");
				int count = 1;
				for(MenuItem mi : menuList) {
					System.out.printf("%d. %s -%d원\n",count++,mi.getName(),mi.getPrice());
				}
				break;
			case 2:
				//메뉴추가기능
				//메뉴번호를 입력받아서 해당 번호에 해당하는 객체를
				//orderList에 추가하면 된다.
				
				//메뉴번호를 입력
				System.out.print("주문할 번호를 골라주세요 : ");
				int menuNum = sc.nextInt();
				//메뉴번호가 1보다 크거나 같거나, 메뉴리스트 사이즈보다는 작거나 같을 때
				if(menuNum >= 1 && menuNum <= menuList.size()) {
					//menuList에서 우리가 선택한번호-1 한 인덱스에서 값을 가져온다.
					MenuItem selected = menuList.get(menuNum-1);
					//orderList에 저장
					orderList.add(selected);
					System.out.println("'"+selected.getName()+"'가 주문에 추가되었습니다.");
				}else {
					System.out.println("잘못된 메뉴 번호입니다.");
				}
				break;
			case 3:
				//결제하기
				//orderList가 비어있으면 결제할 주문이 없습니다 출력하기
				if(orderList.isEmpty()) {
					System.out.println("결제할 주문이 없습니다.");
				} else {
					System.out.println("\n [결제내역]");
					int total = 0;
					for(MenuItem order : orderList) {
						System.out.println("- " + order.getName());
						total += order.getPrice();
					}
					System.out.println("총 금액 : " + total+"원");
					System.out.println("결제가 완료되었습니다. 감사합니다.");
					
					orderList.clear();
				}
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				running = false;
				break;
			case 5:
				//취소하기
				//orderList가 비어있으면
				if(orderList.isEmpty()) {
					System.out.println("주문내역이 없습니다.");
				} else {
					System.out.println("[현재 주문 내역]");
					for(int i = 0; i < orderList.size(); i++) {
						System.out.printf("%d. %s -%d원\n",i+1,orderList.get(i).getName(),orderList.get(i).getPrice());
					}
					
					System.out.print("취소할 주문 번호를 입력하세요 : ");
					int cancelIndex = sc.nextInt();
					
					if(cancelIndex >= 1 && cancelIndex <= orderList.size()) {
						MenuItem removed = orderList.remove(cancelIndex - 1);
						System.out.println("'"+removed.getName()+"'주문이 취소되었습니다.");
					} else {
						System.out.println("잘못된 번호입니다.");
					}
				}
				break;
				//주문내역이 없습니다 출력
				//비어있지 않으면
				//[현재 주문 내역]
				//1. 아메리카노 - 3000원
				//2. 라떼	  - 3500원
				
				//취소할 주문번호를 입력하세요
				//orderList에서 remove하면됩니다.
			}
		}
	}
}







