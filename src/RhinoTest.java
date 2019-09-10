import static org.junit.jupiter.api.Assertions.assertEquals;

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

        Rhino li= new Rhino("li", 1991, 12, 'F');
        assertEquals(true, ernest.isOlder);
    }

}
