import org.junit.*;
import org.junit.rules.ExpectedException;

import java.text.ParseException;


//public class LocationSeatsTest {
//
//    @BeforeClass
//    public static void loadData() throws ParseException {
//
//        view = new view();
//        model = new model();
//        controller = new controller(view, model);
//        controller.process();
//    }
//
//    @Test
//    public void classCheck() {
//        Assume.assumeTrue(model.dataBase.get(0).getClass()==(new concert().getClass()));
//    }
//    @Test
//    public void seatsMatch() {
//        Assert.assertEquals(9, model.dataBase.size());
//    }
//}

public class tests {
    manipulate m = new manipulate();
    @Rule
    public  final ExpectedException exp = ExpectedException.none();

    @Test
    public void testDivException() {
        exp.expect(ArithmeticException.class);
        manipulate.divide(6,0);
    }
}
