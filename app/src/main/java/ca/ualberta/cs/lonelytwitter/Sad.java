package ca.ualberta.cs.lonelytwitter;

public class Sad extends Neutral {
    public Sad(){this.date = "February 1 2019"; }
    public Sad(String Newdate) {this.date = Newdate;}
    public String getMood() {
        return "Current emotion is Sad";
    }
}
