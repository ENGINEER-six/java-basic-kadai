package text.section_14;

public class MethodPlus_1 {

	public static void main(String[] args) {
		
		// 1,000円を送料込みの料金にして表示
		addPostaged(1000);
		
		// 2,000円を送料込みの料金にして表示
		addPostaged(1200);
	}
	
	public static void addPostaged( final int price ) {
		int total = price + 500; // 価格に送料を加算
		System.out.println("送料込みの料金は" + total + "円");
	}

}
