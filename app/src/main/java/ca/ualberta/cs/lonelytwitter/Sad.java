package ca.ualberta.cs.lonelytwitter;

public class Sad extends Neutral {
    //private String date = "";
    public void Sad(){
        this.date = "February 1 2019";
    }
    public void Sad(String Newdate) {this.date = Newdate;}
    public String getMood() {
        return "Current emotion is Sad";
    }
}
