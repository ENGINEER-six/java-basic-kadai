package text.section_09;

public class AgeBaseFee {

	public static void main(String[] args) {
		int ageGroup = 30;	 // 年代
		int fee;			 // 料金
		
		fee = switch(ageGroup) {
			case 10 -> 1000;
			case 20 -> 2000;
			case 30 -> 3000;
			case 40 -> 4000;
			case 50 -> 5000;
			default -> 500;
		};
		
		// 実行結果
		System.out.println(ageGroup + "代の料金は" + fee + "円");
	}

}
