class Box {
	int width;
	int length;
	int height;
}

public class BoxText {

	public static void main(String[] args) {
		Box b;
		b = new Box();
		b.width = 20;
		b.length = 20;
		b.height = 30;
		System.out.println("상자의 가로, 세로, 높이는 " + b.width +", " + b.length + ", " + b.height + "입니다.");
	}
}