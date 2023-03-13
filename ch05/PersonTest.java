public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person();
		
//		p.name = "홍길동";
//		p.age = 23;
		
		p.setAge(170);
		System.out.println(p.getAge());
	}
}
