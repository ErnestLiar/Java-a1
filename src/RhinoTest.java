import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class RhinoTest {

    @Test
    void test() {

        Rhino ernest= new Rhino("ernest", 1990, 5, 'M');
        assertEquals("ernest", ernest.getName());
        assertEquals(false, ernest.isFemale());
        assertEquals(5, ernest.getMOB());
        assertEquals(1990, ernest.getYOB());
        assertEquals(null, ernest.getMom());
        assertEquals(null, ernest.getPop());
        assertEquals(0, ernest.numChildren());

        /*    assertEquals(0,t1.getHour());
        *assertEquals(0,t1.getMinute());
        *assertEquals(“00:00”, t1.toString());
        *t1.setHour(21);
        *assertEquals(21, t1.getHour());
        */
        fail("Not yet implemented");
    }

}
