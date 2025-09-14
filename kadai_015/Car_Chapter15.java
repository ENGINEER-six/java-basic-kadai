package kadai_015;

public class Car_Chapter15 {
	// 【フィールド】
	private int gear	= 1;	// 1速から5速のギアを表す
	private int speed	= 10;	// ギアチェンジ後の速度を表す
	
	// 【メソッド】	
	public void changeGear( final int afterGear ) {
		// 現在のギアを代入する
		int beforeGear = this.gear;
		
		// 現在のギアを更新する
		this.gear = afterGear;
		
		// 【出力】
		System.out.println( "ギア" + beforeGear + "から" + afterGear +  "に切り替えました");
	}
	
	// ギアチェンジ後の速度を表す
	public void run() {		
		// 条件分岐
		switch(this.gear) {
			case 1 -> this.speed = 10;
			case 2 -> this.speed = 20;
			case 3 -> this.speed = 30;
			case 4 -> this.speed = 40;
			case 5 -> this.speed = 50;
			default -> this.speed = 10;		
		}
		// 【出力】
		System.out.println("速度は時速" + this.speed + "kmです");		
	}
}
