import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class RhinoTest {

    @Test
    void testA() {

        Rhino ernest= new Rhino("ernest", 1990, 5, 'M');
        assertEquals("ernest", ernest.getName());
        assertEquals(false, ernest.isFemale());
        assertEquals(5, ernest.getMOB());
        assertEquals(1990, ernest.getYOB());
        assertEquals(null, ernest.getMom());
        assertEquals(null, ernest.getPop());
        assertEquals(0, ernest.numChildren());

    }

    @Test
    void testB() {

        Rhino ernest= new Rhino("ernest", 1990, 5, 'M');
        Rhino adopt= new Rhino("adopt", 1995, 5, 'M');
        Rhino mom= new Rhino("mom", 1990, 5, 'F');
        assertEquals(0, ernest.numChildren());
        adopt.setpop(ernest);
        adopt.setMom(mom);
        assertEquals(1, ernest.numChildren());
        assertEquals(ernest, adopt.getPop());
        assertEquals(mom, adopt.getMom());

    }

    @Test
    void testC() {

        Rhino dad= new Rhino("dad", 1990, 5, 'M');
        Rhino mom= new Rhino("mom", 1990, 5, 'F');
        Rhino kid= new Rhino("kid", 2000, 5, 'F', mom, dad);
        assertEquals(mom, kid.getMom());
        assertEquals(dad, kid.getPop());

    }

    @Test
    void testD() {

        Rhino ernest= new Rhino("ernest", 1990, 5, 'M');
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

        Rhino motherRhino= new Rhino("motherRhino", 1960, 5, 'F');
        Rhino fatherRhino= new Rhino("fatherRhino", 1960, 5, 'M');
        Rhino kevin= new Rhino("kevin", 1990, 7, 'M', motherRhino, fatherRhino);
        Rhino broofKevin= new Rhino("broofKevin", 1985, 5, 'M', motherRhino, fatherRhino);
        // assertEquals(true, kevin.areSiblings(broofKevin));

    }

    @Test
    void testAssert() {

        Rhino fatherRhino= new Rhino("fatherRhino", 1960, 5, 'M');
        Rhino motherRhino= null;
        assertThrows(AssertionError.class,
            () -> { new Rhino("kevin", 1990, 7, 'M', motherRhino, fatherRhino); });

    }

    /** tests for areSiblings() */

}
