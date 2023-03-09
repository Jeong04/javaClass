public class StringTest2 {

	public static void main(String[] args) {
		String proverb = "A barking dog";
		String s1, s2, s3, s4;
		
		System.out.println(proverb.length());
		
		s1 = proverb.concat(" never Bites!");
		System.out.println(s1);
		
		s2 = proverb.replace('b', 'B');
		System.out.println(s2);
		
		s3 = proverb.substring(2, 3);
		System.out.println(s3);
		
		s4 = proverb.toUpperCase();
		System.out.println(s4);
		
		int x = 20;
		System.out.println("결과값은 " + x);
		
		System.out.println("100" + x);
		System.out.println(100 + x);
		
		String s = "1234";
		int n = Integer.parseInt(s);
	}
}
