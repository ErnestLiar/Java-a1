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
        Rhino big= new Rhino("big", 1990, 5, 'F');
        assertEquals(true, ernest.isOlder(li));
        assertEquals(false, li.isOlder(ernest));
        System.out.println(li.isOlder(ernest));
        assertEquals(false, li.isOlder(big));

        /**tests for areSiblings()*/
        Rhino motherRhino = new Rhino("motherRhino", 1960, 5, 'F');
        Rhino fatherRhino = new Rhino("fatherRhino", 1960, 5, 'M');
        Rhino kevin("kevin", 1990, 7, 'M', motherRhino, fatherRhino);
        Rhino
        assertEquals(true,)
    }

}
