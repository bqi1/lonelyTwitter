package ca.ualberta.cs.lonelytwitter;

/**
 * This class is a superclass of @see Sad Happy
 * Has a date, can set and get date, and can return its current mood, as an abstract method
 * @author brianqi
 * @version 1.0
 */
public abstract class Neutral {
    protected String date = "";

    /**
     * Retrieves the object's date
     * @return current class' date as a String
     */
    public String getDate() {
        return this.date;
    }

    /**
     * Given the String parameter, sets current date to the argument date
     * @param Newdate must be a String
     */
    public void setDate(String Newdate) {
        this.date = Newdate;
    }

    /**
     * Is implemented by subclasses
     * @see Happy
     * @see Sad
     * @return a string representing the current mood
     */
    public abstract String getMood();
}
