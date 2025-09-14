package text.section_06;

public class TypeConv_1 {

	public static void main(String[] args) {
		// [範囲の狭いデータ型]→[広範囲なデータ型]の自動型変換
		long valLong = 123; // int型の値をlong型に変換して代入
		float valFloat = 123; // int型の値をfloat型に変換して代入
		double valDocble = 123.4F; // float型の値をdouble型に変換して代入
		
		System.out.println(valLong);
		System.out.println(valFloat);
		System.out.println(valDocble);
	}

}
