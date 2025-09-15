package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		// KatoTaro_Chapter18インスタンスを親クラスのKato_Chapter18へ代入
		Kato_Chapter18 taro = new KatoTaro_Chapter18();
		Kato_Chapter18 ichiro = new KatoIchiro_Chapter18();
		Kato_Chapter18 hanako = new KatoHanako_Chapter18();

		// 名前を設定
		taro.setGivenName();
		ichiro.setGivenName();
		hanako.setGivenName();
		
		
		// 【出力】紹介を実行する
		taro.execlntroduce();
		ichiro.execlntroduce();
		hanako.execlntroduce();
	}
}
