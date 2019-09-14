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

        /** tests for areSiblings() */

        Rhino null1= null;
        Rhino null2= null;
        Rhino null3= new Rhino("null3", 1970, 5, 'M');
        Rhino null4= new Rhino("null4", 1970, 5, 'M');
        assertEquals(false, null3.areSiblings(null4));
        assertEquals(false, null3.areSiblings(null1));

        Rhino motherRhino1= new Rhino("motherRhino1", 1960, 5, 'F');
        Rhino fatherRhino1= new Rhino("fatherRhino1", 1960, 5, 'M');
        Rhino motherRhino2= new Rhino("motherRhino2", 1970, 5, 'F');
        Rhino fatherRhino2= new Rhino("fatherRhino2", 1970, 5, 'M');
        Rhino kevin= new Rhino("kevin", 1990, 7, 'M', motherRhino1, fatherRhino1);
        Rhino broofKevin= new Rhino("broofKevin", 1985, 5, 'M', motherRhino1, fatherRhino1);
        Rhino orphan1= new Rhino("orphan1", 1980, 5, 'F');
        Rhino orphan2= new Rhino("orphan2", 2000, 5, 'M');
        Rhino samemomasKev= new Rhino("samemomasKev", 1985, 5, 'M', motherRhino1, fatherRhino2);
        Rhino samepopasKev= new Rhino("samepopasKev", 1985, 5, 'M', null, fatherRhino1);
        Rhino diffmom= new Rhino("diffmom", 1980, 5, 'M', motherRhino2, null);
        Rhino diffpop= new Rhino("diffpop", 1980, 5, 'M', null, fatherRhino2);
        assertEquals(false, orphan1.areSiblings(orphan2));
        assertEquals(false, kevin.areSiblings(kevin));
        assertEquals(true, kevin.areSiblings(samemomasKev));
        assertEquals(true, kevin.areSiblings(samepopasKev));
        assertEquals(false, kevin.areSiblings(diffmom));
        assertEquals(false, kevin.areSiblings(diffpop));
        assertEquals(true, kevin.areSiblings(broofKevin));

    }

    @Test
    void testAssert() {

        Rhino fatherRhino= new Rhino("fatherRhino", 1960, 5, 'M');
        Rhino motherRhino= null;
        assertThrows(AssertionError.class,
            () -> { new Rhino("kevin", 1990, 7, 'M', motherRhino, fatherRhino); });

    }

}
