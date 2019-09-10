
public class Rhino {
    /** NetId: el657, ny46. Time spent: hh hours, mm minutes. What I thought about this
     * assignment: */
    /** An instance maintains info about the rhino. */

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

}
