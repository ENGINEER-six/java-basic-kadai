package kadai_018;

//【子クラス_加藤花子】
public class KatoHanako_Chapter18 extends Kato_Chapter18 {

	// 【メソッド】
	// 名を表すフィールドの値をセットする
	public void setGivenName() {
		this.givenName = "花子";
	}
	
	// 【抽象メソッド】
	public void eachlntroduce() {
		System.out.println("趣味は読書です");
	}
}
