import org.junit.*;
import org.junit.rules.TestWatcher;



public class MovieTest {

    @Rule
    public TestWatcher testWatcher = new TestWatcher() {
        protected void succeeded(org.junit.runner.Description description) {
            System.out.println("Executing " + description.getMethodName() + "... SUCCEED!");
        };

        protected void failed(Throwable exception, org.junit.runner.Description description) {
            System.out.println("Executing " + description.getMethodName() + "... FAILED!");
        };
    };

    Movie movie;

    @Before
    public void beforeTest(){
        Time time = new Time(30,1);
        movie = new Movie("Test",time);
    }

    @After
    public void afterTest() {
        movie = null;
    }

    @Test
    public void getTitle() {
        String realData = movie.getTitle();
        String expectedValue = "Test";
        Assert.assertEquals(realData,expectedValue);
    }
}