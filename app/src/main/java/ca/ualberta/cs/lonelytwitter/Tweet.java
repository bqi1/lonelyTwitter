package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class Tweet { // Whatever is the class name has to be the file name, declare it using class and class name
    // Sometimes may have to import classes, which in this case is the Date class, download java.util for Date, or just write manually import java.util.Date;
    // To define a method, give visibility (Public, etc.), what it returns (void, etc) and the name (Tweet)
    // Example is within Tweet class we have
    String message;
    String message2;
    Date date;
    public void Tweet(){
     message = "";
     date = null;
    }
    //Animal tiger = new Animal();
    public void setMessage(String tweetmessage){
        message = tweetmessage;

    }
    public String getMessage(){
        return message;
    }
    public void setMessage(String tweetmessage, String message2){
        message = tweetmessage;
        this.message2 = message2;
        System.out.println("Second setMessage has been called");
    }
}

class Animal {
    String name;
    int height;
    int weight;
    int wings;

    public void Animal(){
        this.name = "default";
        height = 0;
        weight = 0;
        wings = 0;
    }
    public void Animal(int height, int weight){
        this.height = height;
    }
}