package curriculum_1_29;

import java.util.HashMap;
import java.util.Map;

public class Inquiry {
	// 入力された数字とprefDateのキーを照会するメソッド
	public void inquiryDate(int[] intArray, Prefecture prf) {
		//prefDate(キー：Integer , 値：String)を宣言する
		Map<Integer, String> prefDate = new HashMap<>();

		//prefDateに値を追加する
		prefDate.put( 0, "北海道:札幌市:83424");
		prefDate.put( 1, "青森県:青森市:9646");
		prefDate.put( 2, "岩手県:盛岡市:15275");
		prefDate.put( 3, "宮城県:仙台市:7282");
		prefDate.put( 4, "秋田県:秋田市:11638");
		prefDate.put( 5, "山形県:山形市:9323");
		prefDate.put( 6, "福島県:福島市:13784");
		prefDate.put( 7, "茨城県:水戸市:6097");
		prefDate.put( 8, "栃木県:宇都宮市:6408");
		prefDate.put( 9, "群馬県:前橋市:6362");
		prefDate.put( 10, "埼玉県:さいたま市:3798");

		for (int i = 0; i < intArray.length; i++) {
			// 入力した値とキーが一致したらに対応する値を取得して
			// String型変数matchDateに代入
			String matchDate = prefDate.get(intArray[i]);

			// separateメソッドで取得した値を":"で区切る
			prf.separate(matchDate);
		}
	}
}