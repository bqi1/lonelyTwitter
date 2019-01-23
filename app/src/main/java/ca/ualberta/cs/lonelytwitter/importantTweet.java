package ca.ualberta.cs.lonelytwitter;

/**
 * A subclass of Tweet
 * @Author bqi1
 * @Version 1.0
 * @see LonelyTwitterActivity
 * @see Tweet
 */
public class importantTweet extends Tweet {

    /**
     * Constructor, does not do anything when created
     */
    public void importantTweet(){

    }

    /**
     * Sets respective message and message2 to the arguments
     * @param firstMessage must be a String
     * @param secondMessage must be a String
     */
    public void setMessage(String firstMessage, String secondMessage){
        message = firstMessage;
        message2 = secondMessage;
    }

    /**
     * A test method, never used, returns nothing of value
     * @return nothing
     */
    public String getSomething(){
        return null;
    }
}
