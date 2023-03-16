class SuperTest {
  int x;
    public SuperTest() {

    }
    public SuperTest(int x) {
        this.x = x;
    }
}

public class Test extends SuperTest {
    int first, second, third;

    public Test(int x, int y) {
        first = x;
        second = y;
    }

    public Test(int x) {
        super(x);
    }
}