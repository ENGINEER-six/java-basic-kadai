package kadai_018;

// 【親クラス】
abstract public class Kato_Chapter18 {
	// 【フィールド】
	// 姓を表す
	public String famliyName = "加藤";
	// 名を表す
	public String givenName;
	// 住所を表す
	public String address = "東京都中野区〇☓";
	
	
	// 【メソッド】
	// 共通の紹介を出力する
	public void commonlntroduce() {
		System.out.println("名前は" + this.famliyName + this.givenName + "です");
		System.out.println("住所は" + this.address + "です");
	}
	
	// 個別の紹介を出力する(抽象メソッド)
	abstract public void eachlntroduce();
	
	// 【実行】
	public void setGivenName() {
	}
	
	// 紹介を実行する
	public void execlntroduce() {
		setGivenName();
		commonlntroduce();
		eachlntroduce();
	}
}
