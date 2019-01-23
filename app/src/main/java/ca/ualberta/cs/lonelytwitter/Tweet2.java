package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
/**
 * Another attempt at representing a message by the user
 * @Author bqi1
 * @Version 1.3
 * @see 1.2
 * @see LonelyTwitterActivity
 */
public class Tweet2 {
    String message;
    Date date;

    /**
     * Constructor for Tweet2, does not do anything if not supplied with a String
     */
    Tweet2(){

    }

    /**
     * @param message, String type
     */
    Tweet2(String message){
        this.message = message;
    }

    /**
     * Returns nothing.
     * Sets current message string to String argument
     * @param message
     */
    public void setMessage(String message){
        this.message = message;
    }

    /**
     * Gets the message from a tweet object
     * @return a string representing the object's message
     */
    public String getMessage(){
        return this.message;
    }

    /**
     * When being called, returns the object's message as a String
     * @return a string
     */
    @Override
    public String toString(){
        return message;
    }
}
