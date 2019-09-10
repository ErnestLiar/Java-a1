
public class Rhino {
    /** NetId: el657, ny46. Time spent: hh hours, mm minutes. What I thought about this
     * assignment: */
    /** An instance maintains info about the rhino. */

    /** Constructor: a new Rhino with name n, birth year y, birth month m, and gender g.<br>
     * Its father and mother are unknown, and it has no children.<br>
     * Precondition: n has at least one character in it, m is 1 for Jan, 2 for Feb, etc.,<br>
     * and g is 'F' or 'M' for female or male */
    public Rhino(String n, int y, int m, char g) {
        name= n;
        year= y;
        month= m;
        gender= g;

    }

    /** the name of the rhino */
    private String name;
    /** the gender of the rhino. Input can either be 'M' for male or 'F' for female */

    private char gender;

    /** the year of the rhino's birth. Can be any integer */
    private int year;

    /** the month of birth. Can be any integer between 1 .. 12. 1 for Jan and 12 for Dec */
    private int month;

    /** the mother of the rhino object. null if unknown */
    private Rhino mom;

    /** the father of the rhino object. null if unknown */
    private Rhino pop;

    /** the number of children of this rhino. Can be any integer greater or equal to 0 */
    private int children;

    /** = the name of this rhino. */
    public String getName() {
        return name;

    }

    /** = this Rhino is female */
    public boolean isFemale() {
        if (gender == 'M') { return false; }
        return true;

    }

    /** = the month this rhino was born in the range 1..12. */
    public int getMOB() {
        return month;
    }

    /** = the year this rhino was born. */
    public int getYOB() {
        return year;

    }

    /** = (pointer to) the object for mother of this rhino. */
    public Rhino getMom() {
        return mom;
    }

    /** = (pointer to) the object for father of this rhino. */
    public Rhino getPop() {
        return pop;
    }

    /** = the number of known children of this rhino. */
    public int numChildren() {
        return children;
    }

}
