package ca.ualberta.cs.lonelytwitter;

public abstract class Neutral {
    public String date = "";
    public void Neutral(){
        this.date = "January 1 2019";
    }
    public void Neutral(String Newdate) {this.date = Newdate;}
    public String getDate() {
        return this.date;
    }
    public void setDate(String Newdate) {
        this.date = Newdate;
    }
    public String getMood() {
        return "Current emotion is Neutral";
    }

}
