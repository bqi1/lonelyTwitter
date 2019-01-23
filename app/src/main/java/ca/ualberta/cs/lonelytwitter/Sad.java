package ca.ualberta.cs.lonelytwitter;

/**
 * This class is a specific mood subclass of @see Neutral
 * Has a date, can set and get date from Neutral, and can return its current mood
 * @author brianqi
 * @version 1.0
 * @see Neutral
 */
public class Sad extends Neutral {

    /**
     * A constructor that sets its date variable to a preset date
     */
    public Sad(){this.date = "February 1 2019"; }

    /**
     * A constructor that sets its date variable to @param Newdate
     * @param Newdate must be a string
     * @return void
     */
    public Sad(String Newdate) {this.date = Newdate;}

    /**
     * @return a string telling the current emotion is Sad
     */
    public String getMood() {
        return "Current emotion is Sad";
    }
}
