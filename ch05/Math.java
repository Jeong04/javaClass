public class Math {
    int add(int x, int y) {
        return x + y;
    }
    public static void main(String[] args) {
        int sum;
        Math math = new Math();
        sum = math.add(2, 3);
        System.out.println("2와 3의 합은 " + sum + "입니다.");
        sum = math.add(7, 8);
        System.out.println("7과 8의 합은 " + sum + "입니다.");
    }
}
