import org.example.Calculator;
import org.example.Point;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {


    @Test
    public final void testTranslater0_0( ) {
        Point a = new Point(1 ,2 ) ;
        Point expected = new Point (1 ,2 ) ;
        Point obtained = a.translater(0 ,0 ) ;
        assertEquals( expected , obtained ) ;
    }
    @Test
    public final void testTranslater1_3( ) {
        Point a = new Point(1 ,2 ) ;
        Point expected = new Point(2 ,5) ;
        Point obtained = a .translater( 1 , 3 ) ;
        assertEquals( expected ,obtained ) ;
    }

}
