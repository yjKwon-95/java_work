package exam1;

public class HybridCar extends Car{
	int electricGauge;
	
	public HybridCar(int gasGauge,int electricGauge) {
		super(gasGauge);
		this.electricGauge = electricGauge;
	}
	
	@Override
	public void showCurrentGauge() {
		super.showCurrentGauge();//잔여가스량
		System.out.println("잔여 전기량 : " + electricGauge);
	}
	
	

	
	
	
}
