import org.junit.Before;
import org.junit.Test;

import play.test.Fixtures;
import play.test.UnitTest;

public class BasicTest extends UnitTest {

    @Before
    public void setup() {
        Fixtures.deleteAllModels();
    }

    @Test
    public void zzaVeryImportantThingToTest() {
        assertEquals(2, 1 + 1);
    }

}
