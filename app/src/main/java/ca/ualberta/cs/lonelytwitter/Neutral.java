package ca.ualberta.cs.lonelytwitter;

public abstract class Neutral {
    private String date;
    public void Neutral(){
        date = "";
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDate() {
        this.date = "January 1 2019";
    }

    public String getMood() {
        return "Neutral";
    }

}
