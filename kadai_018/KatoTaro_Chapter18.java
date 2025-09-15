package kadai_018;

// 【子クラス_加藤太郎】
public class KatoTaro_Chapter18 extends Kato_Chapter18 {
	
	// 【メソッド】
	// 名を表すフィールドの値をセットする
	public void setGivenName() {
		this.givenName	= "太郎";
	}	
	
	// 【抽象メソッド】
	public void eachlntroduce() {
		System.out.println	("Javaが得意です");
	}
}
