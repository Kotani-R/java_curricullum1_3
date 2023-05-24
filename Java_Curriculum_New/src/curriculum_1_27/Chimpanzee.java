package curriculum_1_27;

public class Chimpanzee extends Animal {
	// コンストラクタ
	public Chimpanzee(String name, double length, int speed) {
		//「チンパンジー」を代入
		this.setName(name);
		//「0.94」を代入
		this.setLength(length);
		//「25」を代入
		this.setSpeed(speed);

		// スーパークラスのoutputメソッドを呼び出す
		// 「動物名、体長、速度」をコンソールに出力
		super.output();
		//「学名：パン・トゥログロディテス」
		System.out.println("学名：パン・トゥログロディテス");
	}
}