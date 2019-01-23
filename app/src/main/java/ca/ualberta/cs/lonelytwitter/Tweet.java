package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * A message made by the user
 * @Author bqi1
 * @Version 1.0
 * @see LonelyTwitterActivity
 */
public class Tweet {
    /* Whatever is the class name has to be the file name, declare it using class and class name
     Sometimes may have to import classes, which in this case is the Date class, download java.util for Date, or just write manually import java.util.Date;
     To define a method, give visibility (Public, etc.), what it returns (void, etc) and the name (Tweet)
     Example is within Tweet class we have */
    String message;
    String message2;
    Date date;

    /**
     * Constructor for Tweet, sets message to empty string and date to null
     */
    public void Tweet(){
     message = "";
     date = null;
    }

    /**
     * Sets object's message to @param tweetmessage
     * @param tweetmessage must be a String
     */
    public void setMessage(String tweetmessage){
        message = tweetmessage;

    }

    /**
     * retrieves the object's message
     * @return message as a String
     */
    public String getMessage(){
        return message;
    }

    /**
     * Sets the current message and message2 to tweetmessage and message2 respectively
     * @param tweetmessage must be a String
     * @param message2 must be a String
     */
    public void setMessage(String tweetmessage, String message2){
        message = tweetmessage;
        this.message2 = message2;
        System.out.println("Second setMessage has been called");
    }
}
