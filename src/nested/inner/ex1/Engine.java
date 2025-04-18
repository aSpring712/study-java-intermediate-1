package nested.inner.ex1;

/**
 * Engine
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-18
 * @version 1.0
 */
public class Engine {

	private Car car;

	public Engine(Car car) {
		this.car = car;
	}

	public void start() {
		System.out.println("충전 레벨 확인: " + car.getChargeLevel());
		System.out.println(car.getModel() + "의 엔진을 구동합니다.");
	}
}