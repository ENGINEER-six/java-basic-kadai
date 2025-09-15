package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		// KatoTaro_Chapter18インスタンスを親クラスのKato_Chapter18へ代入
		Kato_Chapter18 kato = new KatoTaro_Chapter18();
		Kato_Chapter18 ichiro = new KatoIchiro_Chapter18();
		Kato_Chapter18 hanako = new KatoHanako_Chapter18();
		
		// 【出力】
		kato.execlntroduce();
		ichiro.execlntroduce();
		hanako.execlntroduce();
	}
}
