# 1. Object 클래스
# java.lang 패키지 소개
자바가 기본으로 제공하는 라이브러리(클래스 모음) 중에 가장 기본이 되는 것이 바로 `java.lang`
패키지이다. 여기서 `lang`은 `Language`(언어)의 줄임말이다. 쉽게 이야기해서 자바 언어를 이루는
가장 기본이 되는 클래스들을 보관하는 패키지를 뜻한다.

### java.lang 패키지의 대표적인 클래스들
- `Object`: 모든 자바 객체의 부모 클래스
- `String`: 문자열
- `Integer`, `Long`, `Double`: 래퍼 타입, 기본형 데이터 타입을 객체로 만든 것
- `Class`: 클래스 메타 정보
- `System`: 시스템과 관련된 기본 기능들을 제공
여기 나열한 클래스들은 자바 언어의 기본을 이루기 때문에 반드시 잘 알아두어야 한다.

### import 생략 가능
`java.lang` 패키지는 모든 자바 애플리케이션에 자동으로 임포트(`import`) 된다. 따라서 임포트
구문을 사용하지 않아도 된다.

다른 패키지에 있는 클래스를 사용하려면 다음과 같이 임포트를 사용해야 한다.

### LangMain
`System` 클래스는 `java.lang` 패키지 소속이다. 따라서 다음과 같이 임포트를 생략할 수 있다.
- `import java.lang.System;` 코드를 삭제해도 정상 동작한다.

---

# Object 클래스
자바에서 모든 클래스의 최상위 부모 클래스는 항상 `Object` 클래스이다.

### lang.object.Parent
- 클래스에 상속 받을 부모 클래스가 없으면 묵시적으로 `Object` 클래스를 상속 받는다.
  - 쉽게 이야기해서 자바가 `extends Object` 코드를 넣어준다.
  - 따라서 `extends Object`는 생략하는 것을 권장한다.

### lang.object.Child
- 클래스에 상속 받을 부모 클래스를 명시적으로 지정하면 `Object`를 상속 받지 않는다.
  - 쉽게 이야기해서 이미 명시적으로 상속했기 때문에 자바가 `extends Object` 코드를 넣지 않는다.

**묵시적(Implicit) vs 명시적(Explicit)**
: 묵시적: 개발자가 코드에 직접 기술하지 않아도 시스템 또는 컴파일러에 의해 자동으로 수행되는 것을 의미 <br/>
명시적: 개발자가 코드에 직접 기술해서 작동하는 것을 의미

### lang.object.ObjectMain
- 예제에서 `toString()`은 `object` 클래스의 메서드이다. 이 메서드는 객체의 정보를 제공한다.

**실행 결과**
`Parent`는 `Object`를 묵시적으로 상속 받았기 때문에 메모리도 함께 생성된다.
1. `child.toString()`을 호출한다.
2. 먼저 본인 타입인 `Child`에서 `toString()`을 찾는다. 없으므로 부모 타입으로 올라가서 찾는다.
3. 부모 타입인 `Parent`에서 찾는다. 없으므로 부모 타입으로 올라가서 찾는다.
4. 부모 타입인 `Object`에서 찾는다. `Object`에 `toString()`이 있으므로 이 메서드를 호출한다.

**정리**
자바에서 모든 객체의 최종 부모는 `Object`다.

## 자바에서 `Object` 클래스가 최상위 부모 클래스인 이유
모든 클래스가 `Object` 클래스를 상속 받는 이유는 다음과 같다.
- 공통 기능 제공
- 다형성의 기본 구현

### 공통 기능 제공
객체의 정보를 제공하고, 이 객체가 다른 객체와 같은지 비교하고, 객체가 어떤 클래스로 만들어졌는지
확인하는 기능은 모든 객체에게 필요한 기본 기능이다. 이런 기능을 객체를 만들 때 마다 항상 새로운
메서드를 정의해서 만들어야 한다면 상당히 번거로울 것이다. <br/>
그리고 막상 만든다고 해도 개발자마다 서로 다른 이름의 메서드를 만들어서 일관성이 없을 것이다. 예를
들어서 객체의 정보를 제공하는 기능을 만든다고 하면 어떤 개발자는 `toString()`으로 또 어떤
개발자는 `objectInfo()`와 같이 서로 다른 이름으로 만들 수 있다. 객체를 비교하는 기능을 만들 때도
어떤 개발자는 `equals()`로 어떤 개발자는 `same()`으로 만들 수 있다.

`Object`는 모든 객체에 필요한 공통 기능을 제공한다. `Object`는 최상위 부모 클래스이기 때문에
모든 객체는 공통 기능을 편리하게 제공(상속) 받을 수 있다.

`Object`가 제공하는 기능
- 객체의 정보를 제공하는 `toString()`
- 객체의 같음을 비교하는 `equals()`
- 객체의 클래스 정보를 제공하는 `getClass()`
- 기타 여러가지 기능

개발자는 모든 객체가 앞서 설명한 메서드를 지원한다는 것을 알고 있다. 따라서 프로그래밍이 단순화되고,
일관성을 가진다.

### 다형성의 기본 구현
부모는 자식을 담을 수 있다. `Object`는 모든 클래스의 부모 클래스이다. 따라서 모든 객체를 참조할
수 있다. <br/>
`Object` 클래스는 다형성을 지원하는 기본적인 메커니즘을 제공한다. 모든 자바 객체는 `Object` 타입으로
처리될 수 있으며, 이는 다양한 타입의 객체를 통합적으로 처리할 수 있게 해준다. <br/>
쉽게 이야기해서 `Object`는 모든 객체를 다 담을 수 있다. 타입이 다른 객체들을 어딘가에 보관해야 한다면
바로 `Object`에 보관하면 된다.

---

# Object 다형성
`Object`는 모든 클래스의 부모 클래스이다. 따라서 `Object`는 모든 객체를 참조할 수 있다.

`Dog`과 `Car`는 서로 아무런 관련이 없는 클래스이다. 둘다 부모가 없으므로 `Object`를 자동으로
상속받는다.

### lang.object.poly.Car, Dog, ObjectPolyExample1
`Object`는 모든 타입의 부모다. 부모는 자식을 담을 수 있으므로 앞의 코드를 다음과 같이 변경해도 된다.
```java
Object dog = new Dog(); // Dog -> Object
Object car = new Car(); // Car -> Object
```

### Object 다형성의 장점
`action(Object obj)` 메서드 분석 <br/>
이 메서드는 `Object` 타입의 매개변수를 사용한다. 그런데 `Object`는 모든 객체의 부모다. 따라서
어떤 객체든지 인자로 전달할 수 있다.

```java
action(dog) // main에서 dog 전달
void action(Object obj = dog(Dog)) // Object는 자식인 Dog 타입을 참조할 수 있다.
```

```java
action(car) // main에서 car 전달
void action(Object obj = car(Car)) // Object는 자식인 Car 타입을 참조할 수 있다.
```

### Object 다형성의 한계
```java
action(dog) // main에서 dog 전달
private static void action(Object obj) {
	obj.sound(); // 컴파일 오류, Object는 sound()가 없다.
}
```
`action()` 메서드안에서 `obj.sound()`를 호출하면 오류가 발생한다. 왜냐하면 매개변수인 `obj`는
`Object` 타입이기 때문이다. `Object`에는 `sound()` 메서드가 없다.

**obj.sound() 호출**
- `obj.sound()`를 호출한다.
- `obj`는 `Object` 타입이므로 `Object` 타입에서 `sound()`를 찾는다.
- `Object`에서 `sound`를 찾을 수 없다. `Object`는 최종 부모이므로 더는 올라가서 찾을 수 없다.
따라서 오류가 발생한다.

`Dog` 인스턴스의 `sound()`를 호출하려면 다음과 같이 다운캐스팅을 해야한다.
```java
if (obj instanceof Dog dog) {
	dog.sound();
}
```
- `Object obj`의 참조값 을 `Dog dog`으로 다운캐스팅 하면서 전달한다.
- `dog.sound()`를 호출하면 `Dog` 타입에서 `sound()`를 찾아서 호출한다.

### Object를 활용한 다형성의 한계
- `Object`는 모든 객체를 대상으로 다형적 참조를 할 수 있다.
  - 쉽게 이야기해서 `Object`는 모든 객체의 부모이므로 모든 객체를 담을 수 있다.
- `Object`를 통해 전달 받은 객체를 호출하려면 각 객체에 맞는 다운캐스팅 과정이 필요하다.
  - `Object`가 세상의 모든 메서드를 알고 있는 것이 아니다.

다형성을 제대로 활용하려면 자바 기본편에서 배운 것 처럼 다형적 참조 + 메서드 오버라이딩을 함께 사용해야
한다. 그런면에서 `Object`를 사용한 다형성에는 한계가 있다. <br/>
`Object`는 모든 객체의 부모이므로 모든 객체를 대상으로 다형적 참조를 할 수 있다. 하지만 `Object`에는
`Dog.sound()`, `Car.move()`와 같은 다른 객체의 메서드가 정의되어 있지 않다. 따라서 메서드
오버라이딩을 활용할 수 없다. 결국 각 객체의 기능을 호출하려면 다운캐스팅을 해야 한다. <br/>
참고로 `Object` 본인이 보유한 `toString()` 같은 메서드는 당연히 자식 클래스에서 오버라이딩
할 수 있다. 여기서 이야기하는 것은 앞서 설명한 `Dog.sound()`, `Car.move()` 같은 `Object`에
속하지 않은 메서드를 말한다.

결과적으로 다형적 참조는 가능하지만, 메서드 오버라이딩이 안되기 때문에 다형성을 활용하기에는 한계가 있다.
그렇다면 `Object`를 언제 사용하면 좋을까?

---

# Object 배열
`Object`는 모든 타입의 객체를 담을 수 있다. 따라서 `Object[]`를 만들면 세상의 모든 객체를
담을 수 있는 배열을 만들 수 있다.

### lang.object.poly.ObjectPolyExample2
```java
Object[] objects = {dog, car, object};
// 쉽게 풀어서 설명하면 다음과 같다.
Object obejct[0] = new Dog();
Object obejct[1] = new Car();
Object obejct[2] = new Object();
```
`Object` 타입을 사용한 덕분에 세상의 모든 객체를 담을 수 있는 배열을 만들 수 있었다.

### size() 메서드
`size(Object[] objects)` 메서드는 배열에 담긴 객체의 수를 세는 역할을 담당한다. <br/>
이 메서드는 `Object` 타입만 사용한다. `Object` 타입의 배열은 세상의 모든 객체를 담을 수
있기 때문에, 새로운 클래스가 추가되거나 변경되어도 이 메서드를 수정하지 않아도 된다. 지금 만든
`size()` 메서드는 자바를 사용하는 곳이라면 어디든지 사용될 수 있다.

## Object가 없다면?
만약 `Object`와 같은 개념이 없다면?
- `void action(Object obj)`과 같이 모든 객체를 받을 수 있는 메서드를 만들 수 없다.
- `Object[] objects`처럼 모든 객체를 저장할 수 있는 배열을 만들 수 없다.

물론 `Object`가 없어도 직접 `MyObject`와 같은 클래스를 만들고 모든 클래스에서 직접 정의한
`MyObject`를 상속 받으면 된다. 하지만 하나의 프로젝트를 넘어서 전세계 모든 개발자가 비슷한
클래스를 만들 것이고, 서로 호환되지 않는 수많은 `XxxObject`들이 넘쳐날 것이다.

---

# toString()
`Object.toString()` 메서드는 객체의 정보를 문자열 형태로 제공한다. 그래서 디버깅과 로깅에
유용하게 사용된다. <br/>
이 메서드는 `Object` 클래스에 정의되므로 모든 클래스에서 상속받아 사용할 수 있다.

### lang.object.tostring
**Object.toString()**
```java
public String toString() {
	return getClass().getName() + "@" + Integer.toHexString(hashCode());
}
```
- `Object`가 제공하는 `toString()` 메서드는 기본적으로 패키지를 포함한 객체의 이름과 객체의
참조값(해시 코드)를 16진수로 제공한다.

**참고**
: 해시코드(`hashCode()`)에 대한 정확한 내용은 이후에 별도로 다룬다. 지금은 객체의 참조값 정도로
생각하면 된다.

**println()과 toString()** <br/>
그런데 `toString()`의 결과를 출력한 코드와 `object`를 `println()`에 직접 출력한 코드의
결과가 완전히 같다.
```java
// toString() 반환값 출력
String string = object.toString();
System.out.println(string);

// object 직접 출력
System.out.println(object);
```

`System.out.println()` 메서드는 사실 내부에서 `toString()`을 호출한다. <br/>
`Object` 타입(자식 포함)이 `println()`에 인수로 전달되면 내부에서 `obj.toString()`
메서드를 호출해서 결과를 출력한다.
```java
public void println(Object x) {
	String s = String.valueOf(x);
	// ...
}
```

```java
public static String valueOf(Object obj) {
	return (obj == null) ? "null" : obj.toString();
}
```

따라서 `println()`을 사용할 때, `toString()`을 직접 호출할 필요 없이 객체를 바로 전달하면
객체의 정보를 출력할 수 있다.

## toString() 오버라이딩
`Object.toString()` 메서드가 클래스 정보와 참조값을 제공하지만 이 정보만으로는 객체의 상태를
적절히 나타내지 못한다. 그래서 보통 `toString()`을 재정의(오버라이딩)해서 보다 유용한 정보를
제공하는 것이 일반적이다.

### lang.object.tostring.Car, Dog, ObjectPrinter
- `Car`는 `toString()`을 재정의하지 않는다.
- `Dog`은 `toString()`을 재정의했다.
- `toString()` 메서드는 IDE의 도움을 받아서 작성하는 것이 매우 편리하다.
  - generator 단축키: `Command + N` ? `Control + N` (macOs) / `Alt + Insert` (Windows/Linux)

### lang.object.tostring.ObjectPrinter
- "객체 정보 출력:"이라는 문자와 객체의 `toString()` 결과를 합해서 출력하는 단순한 기능을 제공한다.

### lang.object.tostring.ToStringMain2
`Car` 인스턴스는 `toString()`을 재정의 하지 않았다. 따라서 `Object`가 제공하는 기본 `toString()`
메서드를 사용한다. <br/>
`Dog` 인스턴스는 `toString()`을 재정의 한 덕분에 객체의 상태를 명확하게 확인할 수 있다.

**ObjectPrinter.print(Object obj) 분석 - Car 인스턴스**
```java
ObjectPrinter.print(car) // main에서 호출

void print(Object obj = car(Car)) { // 인수 전달
	String string = "객체 정보 출력: " + obj.toString();
}
```
- `Object obj`의 인수로 `car(Car)`가 전달된다.
- 메서드 내부에서 `obj.toString()`을 호출한다.
- `obj`는 `Object` 타입이다. 따라서 `Object`에 있는 `toString()`을 찾는다.
- 이때 자식에 재정의(오버라이딩) 된 메서드가 있는지 찾아본다. 재정의된 메서드가 없다.
- `Object.toString()`을 실행한다.

**ObjectPrinter.print(Object obj) 분석 - Dog 인스턴스**
```java
ObjectPrinter.print(dog) // main에서 호출

void print(Object obj = dog(Dog)) { // 인수 전달
	String string = "객체 정보 출력: " + obj.toString();
}
```
- `Object obj`의 인수로 `dog(Dog)`가 전달된다.
- 메서드 내부에서 `obj.toString()`을 호출한다.
- `obj`는 `Object` 타입이다. 따라서 `Object`에 있는 `toString()`을 찾는다.
- 이때 자식에 재정의(오버라이딩) 된 메서드가 있는지 찾아본다. `Dog`에 재정의된 메서드가 있다.
- `Object.toString()`을 실행한다.

**참고 - 객체의 참조값 직접 출력**
`toString()`은 기본으로 객체의 참조값을 출력한다. 그런데 `toString()`이나 `hashCode()`를
재정의하면 객체의 참조값을 출력할 수 없ㅎ다. 이때는 다음 코드를 사용하면 객체의 참조값을 출력할 수 있다.
```java
String refValue = Integer.toHexString(System.identityHashCode(dog1));
System.out.println("refValue = " + refVale);
```

---

# Object와 OCP
만약 `Object`가 없고, 또 `Object`가 제공하는 `toString()`이 없다면 서로 아무 관계가 없는
객체의 정보를 출력하기 어려울 것이다. 여기서 아무 관계가 없다는 것은 공통의 부모가 없다는 뜻이다.
아마도 다음의 `BasObjectPrinter` 클래스와 같이 각각의 클래스마다 별도의 메서드를 작성해야 할 것이다.

### BadObjectPrinter
```java
public class BadObjectPrinter {
	public static void print(Car car) { // Car 전용 메서드
		String string = "객체 정보 출력: " + car.carInfo(); // carInfo 메서드 만듬
        System.out.println(string);  
    }

  public static void print(Dog dog) { // Dog 전용 메서드
    String string = "객체 정보 출력: " + dog.dogInfo(); // dogInfo 메서드 만듬
    System.out.println(string);
  }
}
```

**구체적인 것에 의존**
`BadObjectPrinter`는 구체적인 타입인 `Car`, `Dog`을 사용한다. 따라서 이후에 출력해야 할
구체적인 클래스가 10개로 늘어나면 구체적인 클래스에 맞추어 메서드도 10개로 계속 늘어나게 된다. 이렇게
`BadObjectPrinter` 클래스가 구체적인 특정 클래스인 `Car`, `Dog`을 사용하는 것을
`BadObjectPrinter`는 `Car`, `Dog`에 의존한다고 표현한다.

다행히도 자바에는 **객체의 정보를 사용할 때**, 다형적 참조 문제를 해결해줄 `Object` 클래스와
메서드 오버라이딩 문제를 해결해줄 `Object.toString()` 메서드가 있다. (물론 직접 `Object`와
비슷한 공통의 부모 클래스를 만들어서 해결할 수도 있다.)

**추상적인 것에 의존**
우리가 앞서 만든 `ObjectPrinter` 클래스는 `Car`, `Dog` 같은 구체적인 클래스를 사용하는 것이
아니라, 추상적인 `Object` 클래스를 사용한다. 이렇게 `ObjectPrinter` 클래스가 `Object` 클래스를
사용하는 것을 `ObjectPrinter` 클래스가 `Object` 클래스에 의존한다고 표현한다.

```java
public class ObjectPrinter {
	public static void print(Object obj) {
		String string = "객체 정보 출력: " + obj.toString();
		System.out.println(string);
    }
}
```

`ObjectPrinter`는 구체적인 것에 의존하는 것이 아니라 추상적인 것에 의존한다.

**추상적**
: 여기서 말하는 추상적이라는 뜻은 단순히 추상 클래스나 인터페이스만 뜻하는 것은 아니다. `Animal`과
`Dog`, `Cat`의 관계를 떠올려보자. `Animal` 같은 부모 타입으로 올라갈수록 개념은 더 추상적이게
되고, `Dog`, `Cat`과 같이 하위 타입으로 내려갈 수록 개념은 더 구체적이게 된다.


`ObjectPrinter`와 `Object`를 사용하는 구조는 다형성을 매우 잘 활용하고 있다. 다형성을 잘
활용한다는 것은 다형적 참조와 메서드 오버라이딩을 적절하게 사용한다는 뜻이다.

`ObjectPrinter`의 `print()` 메서드와 전체 구조 분석
- **다형적 참조**: `print(Object obj)`, `Object` 타입을 매개변수로 사용해서 다형적 참조를
사용한다. `Car`, `Dog` 인스턴스를 포함한 세상의 모든 객체 인스턴스를 인수로 받을 수 있다.
- **메서드 오버라이딩**: `Object`는 모든 클래스의 부모이다. 따라서 `Dog`, `Car`와 같은
구체적인 클래스는 `Object`가 가지고 있는 `toString()` 메서드를 오버라이딩 할 수 있다.
따라서 `print(Object obj)`에서 메서드는 `Dog`, `Car`와 같은 구체적인 타입에 의존(사용)하지
않고, 추상적인 `Object` 타입에 의존하면서 런타임에 각 인스턴스의 `toString()`을 호출할 수 있다.

**OCP 원칙**
- **Open**: 새로운 클래스를 추가하고, `toString()`을 오버라이딩해서 기능을 확장할 수 있다. 
- **Closed**: 새로운 클래스를 추가해도 `Object`와 `toString()`을 사용하는 클라이언트
코드인 `ObjectPrinter`는 변경하지 않아도 된다.

다형적 참조, 메서드 오버라이딩, 그리고 클라이언트 코드가 구체적인 `Car`, `Dog`에 의존하는 것이
아니라 추상적인 `Object`에 의존하면서 OCP 원칙을 지킬 수 있었다. 덕분에 새로운 클래스를 추가하고
`toString()` 메서드를 새롭게 오버라이딩해서 기능을 확장할 수 있다. 그리고 이러한 변화에도 불구하고
클라이언트 코드인 `ObjectPrinter`는 변경할 필요가 없다.

`ObjectPrinter`는 모든 타입의 부모인 `Object`를 사용하고, `Object`가 제공하는 `toString()`
메서드만 사용한다. 따라서 `ObjectPrinter`를 사용하면 세상의 모든 객체의 정보(`toString()`)를
편리하게 출력할 수 있다.

### System.out.println()
`System.out.println()` 메서드도 `Object` 매개변수를 사용하고 내부에서 `toString()`을
호출한다. 따라서 `System.out.println()`을 사용하면 세상의 모든 객에의 정보(`toStrinig()`)를
편리하게 출력할 수 있다.

**자바 언어는 객체지향 언어 답게 언어 스스로도 객체지향의 특징을 매우 잘 활용한다.** <br/>
`toString()` 메서드와 같이, 자바 언어가 기본으로 제공하는 다양한 메서드들은 개발자가 필요에
따라 오버라이딩해서 사용할 수 있도록 설계되어 있다.

**참고 - 정적 의존관계 vs 동적 의존관계**
- 정적 의존관계는 컴파일 시간에 결정되며, 주로 클래스 간의 관계를 의미한다. 프로그램을 실행하지 않고,
클래스 내에서 사용하는 타입들만 보면 쉽게 의존관계를 파악할 수 있다.
- 동적 의존관계는 프로그램을 실행하는 런타임에 확인할 수 있는 의존관계이다. 앞서 `ObjectPrinter.print(Object objt)`에
인자로 어떤 객체가 전달 될 지는 프로그램을 실행해봐야 알 수 있다. 어떤 경우에는 `Car` 인스턴스가
넘어오고, 어떤 경우에는 `Dog` 인스턴스가 넘어온다. 이렇게 런타임에 어떤 인스턴스를 사용하는지를
나타내는 것이 동적 의존관계이다.
- 참고로 단순히 의존관계 또는 어디에 의존한다고 하면 주로 정적 의존관계를 뜻한다.
  - e.g. `ObjectPrinter`는 `Object`에 의존한다.

---

# equals() - 1. 동일성과 동등성
`Object`는 동등성 비교를 위한 `equals()` 메서드를 제공한다.

자바는 두 객체가 같다라는 표현을 2가지로 분리해서 제공한다.
- **동일성(Identity)**: `==` 연산자를 사용해서 두 객체의 참조가 동일한 객체를 가리키고 있는지 확인
- **동등성(Equality)**: `equals()` 메서드를 사용해서 두 객체가 논리적으로 동등한지 확인

### 단어 정리
"동일"은 완전히 같음을 의미한다. 반면 "동등"은 같은 가치나 수준을 의미하지만 그 형태나 외관 등이
완전히 같지는 않을 수 있다.

쉽게 이야기해서 동일성은 물리적으로 같은 메모리에 있는 객체 인스턴스인지 참조값을 확인하는 것이고,
동등성은 논리적으로 같은지 확인하는 것이다. <br/>
동일성은 자바 머신 기준으로 메모리의 참조가 기준이므로 물리적이다. 반면 동등성은 보통 사람이 생각하는
논리적인 기준에 맞추어 비교한다.

예를 들어 같은 회원 번호를 가진 회원 객체가 2개 있다고 가정해보자.
```java
User a = new User("id-100") // 참조 x001
User b = new User("id-100") // 참조 x002
```
이 경우 물리적으로 다른 메모리에 있는 다른 객체이지만, 회원 번호를 기준으로 생각해보면 논리적으로는
같은 회원으로 볼 수 있다.

따라서 동일성은 다르지만, 동등성은 같다.

문자의 경우도 마찬가지이다.
```java
String s1 = "hello";
String s2 = "hello";
```
이 경우 물리적으로는 각각의 "hello" 문자열이 다른 메모리에 존재할 수 있지만, 논리적으로는
같은 "hello"라는 문자열이다. (사실 이 경우 자바가 같은 메모리를 사용하도록 최적화 한다.)

## UserV1 예제 - lang.object.equals.UserV1, EqualsMainV1
**동일성 비교**
```java
user1 == user2
x001 == x002
false // 결과
```

**동등성 비교 - Object.equals() 메서드**
```java
public boolean equals(Object obj) {
	return (this == obj);
}
```
`Object`가 기본으로 제공하는 `equals()`는 `==`으로 동일성 비교를 제공한다.

**equals 실행 순서 예시**
```java
user1.equals(user2)
return (user1 == user2) // Object.equals 메서드 안
return (x001 == x002) // Object.equals 메서드 안
return false
false
```

동등성이라는 개념은 각각의 클래스 마다 다르다. 어떤 클래스는 주민등록번호를 기반으로 동등성을
처리할 수 있고, 어떤 클래스는 고객의 연락처를 기반으로 동등성을 처리할 수 있다. 어떤 클래스는
회원 번호를 기반으로 동등성을 처리할 수 있다. <br/>
따라서 동등성 비교를 사용하고 싶으면 `equals()` 메서드를 재정의해야 한다. 그렇지 않으면
`Object`는 동일성 비교를 기본으로 제공한다.

---

# equals() - 2. 구현
### UserV2 예제 - lang.object.equals.UserV2
`UserV2`는 `id`(고객번호)가 같으면 논리적으로 같은 객체로 정의하겠다.
- `Object`의 `equals()` 메서드를 재정의했다.
- `UserV2`의 동등성은 `id`(고객번호)로 비교한다.
- `equals()`는 `Object` 타입을 매개변수로 사용한다. 따라서 객체의 특정 값을 사용하려면
다운캐스팅이 필요하다.
- 여기서는 현재 인스턴스(`this`)에 있는 `id` 문자열과 비교 대상으로 넘어온 객체의 `id` 문자열을
비교한다.
- `UserV2`에 있는 `id`는 `String`이다. 문자열 비교는 `==`이 아니라 `equals`를 사용해야 한다.

### lang.object.equals.EqualsMainV2
- **동일성(Identity)**: 객체의 참조가 다르므로 동일성은 다르다.
- **동등성(Equality)**: `user1`, `user2`는 서로 다른 객체이지만 둘다 같은 `id`(고객번호)를
가지고 있다. 따라서 동등하다.

## 정확한 equals() 구현
앞서 `UserV2`에서 구현한 `equals()`는 이해를 돕기 위해 매우 간단히 만든 버전이고, 실제로
정확하게 동작하려면 다음과 같이 구현해야 한다. 정확한 `equals()` 메서드를 구현하는 것은
생각보다 쉽지 않다.

```java
@Override
public boolean equals(Object o) {
	if (this === o) return true;
	if (o == null || getClass() != o.getClass()) return false;
	User user = (User) o;
	return Object.equals(id, user.id);
}
```

==> Object.equals()는 기본적으로 동일성 비교 (==와 같음), But String 클래스에서는
이를 오버라이딩하여 사용하므로 동등성 비교를 함

**equals() 메서드를 구현할 때 지켜야 하는 규칙**
- **반사성(Reflexivity)**: 객체는 자기 자신과 동등해야 한다. (`x.equals(x)`는 항상 `true`)
- **대칭성(Symmetry)**: 두 객체가 서로에 대해 동일하다고 판단하면, 이는 양방향으로 동일해야 한다.
  (`x.equals(y)`가 `true`이면 `y.equals(x)`도 `true`).
- **추이성(Transitivity)**: 만약 한 객체가 두 번째 객체와 동일하고, 두 번째 객체가 세 번째
객체와 동일하다면, 첫 번째 객체는 세 번째 객체와도 동일해야 한다.
- **일관성(Consistency)**: 두 객체의 상태가 변경되지 않는 한, `equals()` 메소드는 항상
동일한 값을 반환해야 한다.
- **null에 대한 비교**: 모든 객체는 `null`과 비교했을 때 `false`를 반환해야 한다.

**정리**
- 참고로 동등성 비교가 항상 필요한 것은 아니다. 동등성 비교가 필요한 경우에만 `equals()`를
재정의하면 된다.
- `equals()`와 `hashCode()`는 보통 함께 사용된다.

## 정리
## Object의 나머지 메서드
- `clone()` -> 객체를 복사할 때 사용한다. 잘 사용하지 않으므로 다루지 않는다.
- `hashCode()` -> `equals()`와 `hashCode()`는 종종 함께 사용된다.
- `getClass()`
- `notify()`, `notifyAll()`, `wait()` -> 멀티쓰레드용 메서드이다.