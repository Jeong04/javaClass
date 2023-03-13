public class Person {
		
	/* 
	 * member variable은 특별한 이유가 없는 한 private로 만들어라.
	 * 그 member variable을 클래스 외부에서 접근해야 한다면 그를 위한
	 * method를 public으로 구현해라.
	 * 예를 들어, myAge라는 member variable의 값을 읽어오는 메소드는 getAge로
	 * public 접근제어지정자를 명시하여 구현하면 된다.
	 * 이렇게 함으로써 member variable에 잘못 된 값이 설정되는 것을 막을 수도 있고
	 * 향후에 그 클래스를 버전업하면서 member variable의 이름을 변경해도
	 * 그 클래스를 사용하는 외부 클래스에는 아무 영향을 미치지 않게 된다.
	 */

	String name;
	int myAge;

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		if(age >= 0 && age <= 150)
			this.myAge = age;
		System.out.println("나이의 범위는 0부터 150까지 입니다.");
	}

	public int getAge() {
		return myAge;
	}

	private void test() {
		System.out.println(name);
	}
}
