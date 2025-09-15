package kadai_018;

//【子クラス_加藤一郎】
public class KatoIchiro_Chapter18 extends Kato_Chapter18 {

	// 【メソッド】
	// 名を表すフィールドの値をセットする
	public void setGivenName() {
		this.givenName = "一郎";
		
	}
	
	// 【抽象メソッド】
	public void eachlntroduce() {
		System.out.println("好きな食べ物はリンゴです");
	}

}
