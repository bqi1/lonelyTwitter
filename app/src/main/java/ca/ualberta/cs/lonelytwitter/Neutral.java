package ca.ualberta.cs.lonelytwitter;

public abstract class Neutral {
    public String date = "";
    public String getDate() {
        return this.date;
    }
    public void setDate(String Newdate) {
        this.date = Newdate;
    }
    public abstract String getMood();
}
