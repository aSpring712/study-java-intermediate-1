package nested.inner.ex1;

/**
 * Car
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-18
 * @version 1.0
 */
public class Car {

	private String model;
	private int chargeLevel;
	private Engine engine;

	public Car(String model, int chargeLevel) {
		this.model = model;
		this.chargeLevel = chargeLevel;
		this.engine = new Engine(this);
	}

	// Engine에서만 사용하는 메서드
	public String getModel() {
		return this.model;
	}

	// Engine에서만 사용하는 메서드
	public int getChargeLevel() {
		return this.chargeLevel;
	}

	public void start() {
		engine.start();
		System.out.println(model + " 시작 완료");
	}
}