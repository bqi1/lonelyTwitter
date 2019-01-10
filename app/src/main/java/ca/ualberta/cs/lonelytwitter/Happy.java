package ca.ualberta.cs.lonelytwitter;

public class Happy extends Neutral{
    public Happy(){this.date = "March 1 2019"; }
    public Happy(String Newdate) {this.date = Newdate;}
    public String getMood() {
        return "Current emotion is Happy";
    }
}
