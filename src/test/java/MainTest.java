import org.junit.jupiter.api.*;

public class MainTest {
    @Test
    public void test_Given_weWantAWelcomeMessage(){
        //arrange

        //act
        String actual = Main.GetMessage();

        //assert
        Assertions.assertEquals("Hello MaintenanceMonitor", actual);
    }
}
