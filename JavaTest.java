public class JavaTest {

  // member method
  // instance method
  double square(double df) {
    test();
    return df * df;
  }

  void test() {
    System.out.println("test method called");
  }

  public static void main(String args[]) {
    System.out.println("hello world");
    // double r = square(4.0);

    JavaTest jt = new JavaTest();
    double result = jt.square(3);
    System.out.println(result);
  }
}
