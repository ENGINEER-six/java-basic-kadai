package kadai_028;

public class JyankenExec_Chapter28 {

	public static void main(String[] args) {
		Jyanken_Chapter28 jyanken = new Jyanken_Chapter28();
		
		String myChoice = jyanken.getMyChoice(); // 変数名を修正
		
		String opponentChoice = jyanken.getRandom(); // 変数名と型を修正
		
		jyanken.playGame(myChoice, opponentChoice); // 変数名を修正
		
		// プログラムの終了時にScannerを閉じる
		jyanken.closeScanner(); // メソッド名を修正
	}
}