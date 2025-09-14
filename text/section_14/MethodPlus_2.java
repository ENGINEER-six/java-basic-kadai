package text.section_14;

public class MethodPlus_2 {

	public static void main(String[] args) {
		
		final int postage1 = 500; // 送料1
		final int postage2 = 800; // 送料2
		
		// 1,000円を送料込みの料金にして表示
		addPostaged( 1000, postage1);
		
		// 2,000円を送料込みの料金にして表示
		addPostaged( 1000, postage2);
	}
	
	public static void addPostaged( final int price, final int postage ) {
		int total = price + postage; // 価格に送料を加算
		System.out.println("送料込みの料金は" + total + "円");
	}

}
