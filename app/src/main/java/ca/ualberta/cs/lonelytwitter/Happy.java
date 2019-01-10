package ca.ualberta.cs.lonelytwitter;

public class Happy extends Neutral{
    //private String date = "";
    public void Happy(){ this.date = "March 1 2019"; }
    public void Happy(String Newdate) {this.date = Newdate;}
    public String getMood() {
        return "Current emotion is Happy";
    }
}
