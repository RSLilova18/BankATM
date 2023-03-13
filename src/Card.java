public class Card {

    private boolean access;
    private String type;


    public Card (){
        this.access=true;
        this.type = "Visa";
    }

    public Card(boolean access, String type) {
        this.access = access;
        this.type = type;
    }

    public boolean isAccess() {
        return access;
    }

    public void setAccess(boolean access) {
        this.access = access;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
