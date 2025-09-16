package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	// 【HashMap宣言】英単語の辞書として機能する
	HashMap<String, String> dictionaryMap = new HashMap<String, String>();
	
	// コンストラクタを追加し、インスタンス生成時に辞書を初期化する
	public Dictionary_Chapter21() {
		fruit();
	}
	
	// 【HashMap_要素の追加】
	private void fruit() { 
		dictionaryMap.put("apple", "りんご");
		dictionaryMap.put("peach", "桃");
		dictionaryMap.put("banana", "バナナ");
		dictionaryMap.put("lemon", "レモン");
		dictionaryMap.put("pear",	"梨");
		dictionaryMap.put("kiwi",	"キウイ");
		dictionaryMap.put("strawberry","いちご");
		dictionaryMap.put("grape", "ぶどう");
		dictionaryMap.put("muscat", "マスカット");
		dictionaryMap.put("cherry", "さくらんぼ");
	}
	
	// 【繰り返し処理_調べる英単語が辞書に追加されているか判定する】
	public void searchWord(String word) {
		if(dictionaryMap.containsKey(word)) {
			System.out.println(word + "の意味は" + dictionaryMap.get(word));
		} else {
			System.out.println(word + "は辞書に存在しません");
		}
	}
}
