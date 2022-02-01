import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;

public class TimeTest {

    @Rule
    public TestWatcher testWatcher = new TestWatcher() {
        protected void succeeded(org.junit.runner.Description description) {
            System.out.println("Executing " + description.getMethodName() + "... SUCCEED! \n");
        }

        protected void failed(Throwable exception, org.junit.runner.Description description) {
            System.out.println("Executing " + description.getMethodName() + "... FAILED!");
        };
    };

    @Test
    public void timeTest1() { new Time(10, 15); }

    @Test
    public void timeTest2() {
        new Time(20, 75);
    }

    @Test
    public void timeTest3() {
        new Time(80, 3);
    }

    @Test
    public void timeTest4() {
        new Time(90, 26);
    }

}