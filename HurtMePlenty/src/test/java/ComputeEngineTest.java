import org.testng.annotations.Test;
import page.ComputeEnginePage;
import util.WaiterWrapperClass;

public class ComputeEngineTest extends BaseTest {

    public static ComputeEnginePage computeEnginePage;
    int numberOfInstances = 4;


    @Test
    public void test1() {
        computeEnginePage = new ComputeEnginePage(driver);
        computeEnginePage.openComputeEnginePage();
    }
    @Test
    public void test2() throws InterruptedException {
        computeEnginePage.inputNumberOfInstance(4);
    }

}
