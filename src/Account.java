public class Account {

    private String type;
    private String userName;
    private int pinCode;
    private String iBAN;


    public Account (){

        this.type = "uchenicheski";
        this.userName = "Raya";
        this.pinCode = 1234;
        this.iBAN = "HEDKJW293482NS";

    }

    public Account(String type, String userName, int pinCode, String iBAN) {
        this.type = type;
        this.userName = userName;
        this.pinCode = pinCode;
        this.iBAN = iBAN;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getiBAN() {
        return iBAN;
    }

    public void setiBAN(String iBAN) {
        this.iBAN = iBAN;
    }
}
