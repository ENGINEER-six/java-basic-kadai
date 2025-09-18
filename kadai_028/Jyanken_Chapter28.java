package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	// 【生成】Scannerクラスのオブジェクト
	Scanner scanner = new Scanner(System.in);
	
	// 自分のじゃんけんの手を入力する
	public String getMyChoice() {
		// 【出力】
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		String jyankenInput = null;
		
		// 正しいじゃんけんの手であるか判定する		
		while(true) { // 無限ループを回避し、正しい入力が得られるまで繰り返す
			// 入力した内容を取得する
			String input = scanner.next();
			
			// 正しいじゃんけんの手であるか判定する
			if (input.equals("r") ||  input.equals("s") || input.equals("p")) {
				jyankenInput = input;
				break; // 正しい入力なのでループを抜ける
			} else {
				System.out.println("入力値がエラーです。正しい手を入力してください");
			}
		}
		
		// じゃんけんクラスを実行するクラスに、自分のじゃんけんの手を返す
		return jyankenInput; // メソッド名を修正
	}
	
	// 対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() { // 戻り値の型をcharからStringに修正
		// 配列にじゃんけんの手をセットする
		String[] jyankenSet = {"r", "s", "p"};
		
		// 乱数で対戦相手のじゃんけんの手を選ぶ
		int i = (int)Math.floor(Math.random() *3);
		
		// じゃんけんクラスを実行するクラスに対戦相手のじゃんけんの手を返す
		return jyankenSet[i];
	}
	
	// じゃんけんを行う
	public void playGame(String myChoice, String opponentChoice) { // 引数名を修正
		HashMap<String, String> hand = new HashMap<>(); // 型引数の指定を修正
		hand.put("r", "グー");
		hand.put("s", "チョキ");
		hand.put("p", "パー");
		System.out.println("自分の手は" + hand.get(myChoice) + ",対戦相手の手は" + hand.get(opponentChoice)); // 変数名を修正
		
		HashMap<String, String> results = new HashMap<>(); // 型引数の指定を修正
		results.put("rr", "あいこです");
		results.put("rs", "自分の勝ちです");
		results.put("rp", "自分の負けです");
		results.put("ss", "あいこです");
		results.put("sp", "自分の勝ちです");
		results.put("sr", "自分の負けです");
		results.put("pp", "あいこです");
		results.put("pr", "自分の勝ちです");
		results.put("ps", "自分の負けです");
		
		System.out.println(results.get(myChoice + opponentChoice)); // 変数名を修正
	}
	
	public void closeScanner() {
		if (scanner != null) {
			scanner.close();
		}
	}
}