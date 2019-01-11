package ca.ualberta.cs.lonelytwitter;

public abstract class Neutral {
    protected String date = "";
    public String getDate() {
        return date;
    }
    public void setDate(String Newdate) {
        this.date = Newdate;
    }
    public abstract String getMood();
}
