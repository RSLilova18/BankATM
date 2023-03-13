public class ATM {

    private String location;
    private int date;


    public ATM (){
        this.location = "troikata";
        this.date = 1201;
    }

    public ATM(String location, int date) {
        this.location = location;
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
