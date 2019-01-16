package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class Tweet2 {
    String message;
    Date date;

    Tweet2(){

    }
    Tweet2(String message){
        this.message = message;
    }
    public void setMessage(String message){
        this.message = message;
    }
    public String getMessage(){
        return this.message;
    }
    @Override
    public String toString(){
        return message;
    }
}
