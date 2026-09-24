package budgetbuddy;
import static org.junit.Assert.*;
import org.junit.Test;

    //~ Fields ................................................................

    //~ Constructors ..........................................................

    //~Public  Methods ........................................................
/**
 * Tests the Entry class.
 */
public class EntryTest
{
    /**
     * tests a normal Entry and both getter methods
     */
    @Test
    public void testNormalEntry()
    {
        Entry entry = new Entry(15.81, "Food");

        assertEquals(15.81, entry.getAmount(), 0.01);
        assertEquals("Food", entry.getCategory());
    }


    /**
     * tests that a negative amount becomes positive
     */
    @Test
    public void testNegativeAmount()
    {
        Entry entry = new Entry(-10.00, "Food");

        assertEquals(10.00, entry.getAmount(), 0.01);
        assertEquals("Food", entry.getCategory());
    }


    /**
     * tests that an unknown category becomes Other
     */
    @Test
    public void testUnknownCategory()
    {
        Entry entry = new Entry(10.00, "Frisbee");

        assertEquals(10.00, entry.getAmount(), 0.01);
        assertEquals("Other", entry.getCategory());
    }


    /**
     * tests another valid category
     */
    @Test
    public void testValidCategory()
    {
        Entry entry = new Entry(25.00, "Entertainment");

        assertEquals("Entertainment", entry.getCategory());
    }
    /**
     * tests all categories
     */
    @Test
    public void testValidCategories()
    {
        Entry food = new Entry(10.00, "Food");
        Entry rent = new Entry(10.00, "Rent");
        Entry education = new Entry(10.00, "Education");
        Entry entertainment = new Entry(10.00, "Entertainment");

        assertEquals("Food", food.getCategory());
        assertEquals("Rent", rent.getCategory());
        assertEquals("Education", education.getCategory());
        assertEquals("Entertainment", entertainment.getCategory());
    }
}