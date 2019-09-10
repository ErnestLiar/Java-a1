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



        /**tests for areSiblings()*/
        Rhino motherRhino = new Rhino("motherRhino", 1960, 5, 'F');
        Rhino fatherRhino = new Rhino("fatherRhino", 1960, 5, 'M');
        Rhino kevin("kevin", 1990, 7, 'M', motherRhino, fatherRhino);
        Rhino
        assertEquals(true,)

        Rhino li= new Rhino("li", 1990, 5, 'F');
        Rhino yu= new Rhino("yu", 1990, 3, 'F');
        Rhino melody= new Rhino("melody", 1990, 6, 'F');
        Rhino may77= new Rhino("may77", 1977, 5, 'F');
        Rhino aug77= new Rhino("aug77", 1977, 8, 'F');
        Rhino feb77= new Rhino("feb77", 1977, 2, 'F');

        Rhino may99= new Rhino("may77", 1999, 5, 'F');
        Rhino aug99= new Rhino("aug99", 1999, 8, 'F');
        Rhino feb99= new Rhino("feb99", 1999, 2, 'F');

        assertEquals(true, ernest.isOlder(may99));
        assertEquals(true, ernest.isOlder(aug99));
        assertEquals(true, ernest.isOlder(feb99));
        assertEquals(true, ernest.isOlder(melody));

        assertEquals(false, ernest.isOlder(may77));
        assertEquals(false, ernest.isOlder(aug77));
        assertEquals(false, ernest.isOlder(feb77));
        assertEquals(false, ernest.isOlder(yu));
        assertEquals(false, ernest.isOlder(li));

    }

}
