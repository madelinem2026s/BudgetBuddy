package budgetbuddy;
/**
 * Entry class
 */
public class Entry
{
    //~ Fields ................................................................
    private double amount;
    private String category;
    //~ Constructors ..........................................................
    /**
     * 
     * @param amount
     * @param category
     */
    public Entry(double amount, String category)
    {
        this.amount = Math.abs(amount);

        if (category.equals("Food")
            || category.equals("Rent")
            || category.equals("Education")
            || category.equals("Entertainment"))
        {
            this.category = category;
        }
        else
        {
            this.category = "Other";
        }
    }
    //~Public  Methods ........................................................
    /**
     * gets the amount of expense
     *
     * @return the expense amount
     */
    public double getAmount()
    {
        return amount;
    }
    /**
     * gets the category of expense
     *
     * @return the expense category
     */
    public String getCategory()
    {
        return category;
    }
}
